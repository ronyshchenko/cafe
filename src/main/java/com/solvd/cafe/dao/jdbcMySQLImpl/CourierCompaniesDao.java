package com.solvd.cafe.dao.jdbcMySQLImpl;

import com.solvd.cafe.Util.DataBaseConnection;
import com.solvd.cafe.dao.ICourierCompaniesDao;
import com.solvd.cafe.models.CourierCompaniesModel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CourierCompaniesDao implements ICourierCompaniesDao {
    private static final Logger LOGGER = LogManager.getLogger(CourierCompaniesDao.class);
    final String deleteStatementS = "DELETE FROM couriercompanies  WHERE id=?";
    final String getStatement = "SELECT * FROM couriercompanies WHERE id = ?";
    final String insertStatementS = "INSERT INTO couriercompanies VALUES (?, ?, ?, ?, ?)";
    final String updateStatementS = "UPDATE couriercompanies SET name=? WHERE id=?";
    PreparedStatement stmt = null;


    @Override
    public void createCourierCompanies(CourierCompaniesModel courierCompaniesModel) {
        Connection dbConnect = DataBaseConnection.getConnection();
        try {
            stmt = dbConnect.prepareStatement(insertStatementS);
            stmt.setInt(1, courierCompaniesModel.getId());
            stmt.setString(2, courierCompaniesModel.getName());
            stmt.setString(3, courierCompaniesModel.getAddress());
            stmt.setString(4, courierCompaniesModel.getEmail());
            stmt.setString(5, courierCompaniesModel.getSite());
            int i = stmt.executeUpdate();
            LOGGER.info(i + " records inserted");
        } catch (Exception e) {
            LOGGER.info(e);
        }
    }


    @Override
    public void updateCourierCompanies(int id, String name) {
        Connection dbConnect = DataBaseConnection.getConnection();
        try {
            stmt = dbConnect.prepareStatement(updateStatementS);
            stmt.setInt(2, id);
            stmt.setString(1, name);
            int i = stmt.executeUpdate();
            LOGGER.info(i + " records updated");
        } catch (Exception e) {
            LOGGER.info(e);
        }
    }


    @Override
    public List<CourierCompaniesModel> getCourierCompaniesById(int id) {
        Connection con = DataBaseConnection.getConnection();
        try  {
            stmt = con.prepareStatement(getStatement);
            stmt.setInt(1, id);
            ResultSet result = stmt.executeQuery();
            ArrayList<CourierCompaniesModel> courierCompaniesModels = new ArrayList<CourierCompaniesModel>();
            while (result.next()) {
                id = result.getInt(1);
                String name = result.getString(2);
                String address = result.getString(3);
                String email = result.getString(4);
                String site = result.getString(5);
                CourierCompaniesModel courierCompaniesModel = new CourierCompaniesModel(id, name, address, email, site);
                courierCompaniesModels.add(courierCompaniesModel);
                courierCompaniesModel.toString();
                LOGGER.info(courierCompaniesModel.toString());
            }
            LOGGER.info("ALL is OK!");
            return courierCompaniesModels;
        } catch (Exception e) {
            LOGGER.info(e);
        }
        return null;
    }

    @Override
    public void deleteCourierCompaniesById(int id) {
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






