package com.solvd.cafe.dao.jdbcMySQLImpl;

import com.solvd.cafe.Util.DataBaseConnection;
import com.solvd.cafe.dao.ICouriersDao;
import com.solvd.cafe.models.CategoriesProdModel;
import com.solvd.cafe.models.CouriersModel;
import com.solvd.cafe.models.CurrenciesModel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CouriersDao implements ICouriersDao {
    private static final Logger LOGGER = LogManager.getLogger(CouriersDao.class);
    final String deleteStatementS = "DELETE FROM couriers WHERE id=?";
    final String getStatement = "SELECT * FROM couriers WHERE id = ?";
    final String insertStatementS = "INSERT INTO couriers VALUES (?, ?, ?, ?, ?)";
    final String updateStatementS = "UPDATE couriers SET name=? WHERE id=?";


    @Override
    public void createCouriers(CouriersModel couriersModel) {
        try (Connection dbConnect = DataBaseConnection.getConnection()) {
            PreparedStatement stmt = dbConnect.prepareStatement(insertStatementS);
            stmt.setInt(1, couriersModel.getId());
            stmt.setString(2, couriersModel.getName());
            stmt.setString(3, couriersModel.getSurname());
            stmt.setString(4, couriersModel.getPhone());
            stmt.setInt(5, couriersModel.getCompanyid());
            int i = stmt.executeUpdate();
            LOGGER.info(i + " records inserted");
        } catch (Exception e) {
            LOGGER.info(e);
        }
    }
    @Override
    public void updateCouriers(int id, String name) {
        try (Connection dbConnect = DataBaseConnection.getConnection()) {
            PreparedStatement stmt = dbConnect.prepareStatement(updateStatementS);
            stmt.setInt(2, id);
            stmt.setString(1, name);
            int i = stmt.executeUpdate();
            LOGGER.info(i + " records updated");
        } catch (Exception e) {
            LOGGER.info(e);
        }
    }

    @Override
    public List<CouriersModel> getCouriersById(int id) {
        try (Connection con = DataBaseConnection.getConnection()) {
            PreparedStatement statement = con.prepareStatement(getStatement);
            statement.setInt(1, id);
            ResultSet result = statement.executeQuery();
            ArrayList<CouriersModel> couriersModels = new ArrayList<CouriersModel>();
            while (result.next()) {
                id = result.getInt(1);
                String name = result.getString(2);
                String surname = result.getString(3);
                String phone = result.getString(4);
                int companyid = result.getInt(5);
                CouriersModel couriersModel = new CouriersModel(id, name, surname, phone, companyid);
                couriersModels.add(couriersModel);
                couriersModel.toString();
                LOGGER.info(couriersModel.toString());
            }
            LOGGER.info("ALL is OK!");
            return couriersModels;
        } catch (Exception e) {
            LOGGER.info(e);
        }
        return null;
    }

    @Override
    public void deleteCouriersById(int id) {
        int x = 0;
        Connection dbConnect = DataBaseConnection.getConnection();
        PreparedStatement deleteStatement = null;
        try {
            deleteStatement = dbConnect.prepareStatement(deleteStatementS);
            deleteStatement.setInt(1, id);
            int i = deleteStatement.executeUpdate();
            LOGGER.info(i + " records deleted");
        } catch (SQLException e) {
            LOGGER.error("ERROR DELETE Appointment WITH ID " + e.getMessage());
            x = 1;
        } finally {
            DataBaseConnection.close(deleteStatement);
            DataBaseConnection.close(dbConnect);
            if (x == 0) {
                LOGGER.info("SUCCESS CLOSE");
            } else
                LOGGER.info("FAIL CLOSE");
        }
    }
}
