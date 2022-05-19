package com.solvd.cafe.dao.jdbcMySQLImpl;

import com.solvd.cafe.Util.DataBaseConnection;
import com.solvd.cafe.dao.ICurrenciesDao;
import com.solvd.cafe.models.CurrenciesModel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CurrenciesDao implements ICurrenciesDao {
    private static final Logger LOGGER = LogManager.getLogger(CurrenciesDao.class);
    final String deleteStatementS = "DELETE FROM currencies WHERE id=?";
    final String getStatement = "SELECT * FROM currencies WHERE id = ?";
    final String insertStatementS = "INSERT INTO currencies VALUES (?, ?)";
    final String updateStatementS = "UPDATE currencies SET name=? WHERE id=?";
    PreparedStatement stmt = null;

    @Override
    public void createCurrencies(CurrenciesModel currenciesModel) {
        try (Connection dbConnect = DataBaseConnection.getConnection()) {
            System.out.println(dbConnect);
            PreparedStatement stmt = dbConnect.prepareStatement(insertStatementS);
            stmt.setInt(1, currenciesModel.getId());
            stmt.setString(2, currenciesModel.getName());
            int i = stmt.executeUpdate();
            LOGGER.info(i + " records inserted");
        } catch (Exception e) {
            LOGGER.info(e);
        }
    }
    @Override
    public void updateCurrencies(int id, String name) {
        try (Connection dbConnect = DataBaseConnection.getConnection()) {
            PreparedStatement stmt = dbConnect.prepareStatement(updateStatementS);
            stmt.setString(1, name);
            stmt.setInt(2, id);
            int i = stmt.executeUpdate();
            LOGGER.info(i + " records updated");
        } catch (Exception e) {
            LOGGER.info(e);
        }
    }

    @Override
    public void deleteCurrenciesById(int id) {
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

     @Override
    public List<CurrenciesModel> getCurrenciesById(int id) {
        try (Connection con = DataBaseConnection.getConnection()) {
            PreparedStatement statement = con.prepareStatement(getStatement);
            statement.setInt(1, id);
            ResultSet result = statement.executeQuery();
            ArrayList<CurrenciesModel> currenciesModels = new ArrayList<CurrenciesModel>();
            while (result.next()) {
                id = result.getInt(1);
                String name = result.getString(2);
                CurrenciesModel currenciesModel = new CurrenciesModel(id, name);
                currenciesModels.add(currenciesModel);
                currenciesModel.toString();
                LOGGER.info(currenciesModel.toString());
            }
            LOGGER.info("ALL is OK!");
            return currenciesModels;
        } catch (Exception e) {
            LOGGER.info(e);
        }
        return null;
    }
}
