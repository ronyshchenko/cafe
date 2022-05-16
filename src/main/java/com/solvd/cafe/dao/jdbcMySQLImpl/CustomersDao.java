package com.solvd.cafe.dao.jdbcMySQLImpl;

import com.solvd.cafe.Util.DataBaseConnection;
import com.solvd.cafe.dao.ICustomersDao;
import com.solvd.cafe.models.CouriersModel;
import com.solvd.cafe.models.CustomersModel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class CustomersDao implements ICustomersDao {
    private static final Logger LOGGER = LogManager.getLogger(CouriersDao.class);
    final String deleteStatementS = "DELETE FROM customers WHERE id=?";
    final String getStatement = "SELECT * FROM customers WHERE id = ?";
    final String insertStatementS = "INSERT INTO customers VALUES (?, ?, ?, ?, ?)";
    final String updateStatementS = "UPDATE customers SET name=? WHERE id=?";

    @Override
    public void createCustomers(CustomersModel customersModel) {
        try (Connection dbConnect = DataBaseConnection.getConnection()) {
            PreparedStatement stmt = dbConnect.prepareStatement(insertStatementS);
            stmt.setInt(1, customersModel.getId());
            stmt.setString(2, customersModel.getName());
            stmt.setString(3, customersModel.getAddress());
            stmt.setString(4, customersModel.getCity());
            stmt.setString(5, customersModel.getEmail());
            int i = stmt.executeUpdate();
            LOGGER.info(i + " records inserted");
        } catch (Exception e) {
            LOGGER.info(e);
        }
    }

    @Override
    public void updateCustomers(int id, String name) {
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
    public List<CustomersModel> getCustomersById(int id) {
        try (Connection con = DataBaseConnection.getConnection()) {
            PreparedStatement statement = con.prepareStatement(getStatement);
            statement.setInt(1, id);
            ResultSet result = statement.executeQuery();
            ArrayList<CustomersModel> customersModels = new ArrayList<CustomersModel>();
            while (result.next()) {
                id = result.getInt(1);
                String name = result.getString(2);
                String address = result.getString(3);
                String city = result.getString(4);
                String email = result.getString(5);
                CustomersModel customersModel = new CustomersModel(id, name, address, city, email);
                customersModels.add(customersModel);
                customersModel.toString();
                LOGGER.info(customersModel.toString());
            }
            LOGGER.info("ALL is OK!");
            return customersModels;
        } catch (Exception e) {
            LOGGER.info(e);
        }
        return null;
    }

    @Override
    public void deleteCustomersById(int id) {
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
