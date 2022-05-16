package com.solvd.cafe.dao.jdbcMySQLImpl;

import com.solvd.cafe.Util.DataBaseConnection;
import com.solvd.cafe.dao.IInvoicesDao;
import com.solvd.cafe.models.CustomersModel;
import com.solvd.cafe.models.InvoicesModel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class InvoicesDao implements IInvoicesDao {

    private static final Logger LOGGER = LogManager.getLogger(InvoicesDao.class);
    final String deleteStatementS = "DELETE FROM invoices WHERE id=?";
    final String getStatement = "SELECT * FROM invoices WHERE id = ?";
    final String insertStatementS = "INSERT INTO invoices VALUES (?, ?, ?, ?, ?)";
    final String updateStatementS = "UPDATE invoices SET volume=? WHERE id=?";



    @Override
    public void createInvoices(InvoicesModel invoicesModel) {
        try (Connection dbConnect = DataBaseConnection.getConnection()) {
            PreparedStatement stmt = dbConnect.prepareStatement(insertStatementS);
            stmt.setInt(1, invoicesModel.getId());
            stmt.setString(2, invoicesModel.getDate());
            stmt.setInt(3, invoicesModel.getReceiverid());
            stmt.setString(4, invoicesModel.getDescription());
            stmt.setInt(5, invoicesModel.getVolume());
            int i = stmt.executeUpdate();
            LOGGER.info(i + " records inserted");
        } catch (Exception e) {
            LOGGER.info(e);
        }
    }

    @Override
    public void updateInvoices(int id, int volume) {
        try (Connection dbConnect = DataBaseConnection.getConnection()) {
            PreparedStatement stmt = dbConnect.prepareStatement(updateStatementS);
            stmt.setInt(2, id);
            stmt.setInt(1, volume);
            int i = stmt.executeUpdate();
            LOGGER.info(i + " records updated");
        } catch (Exception e) {
            LOGGER.info(e);
        }
    }

    @Override
    public List<InvoicesModel> getInvoicesById(int id) {
        try (Connection con = DataBaseConnection.getConnection()) {
            PreparedStatement statement = con.prepareStatement(getStatement);
            statement.setInt(1, id);
            ResultSet result = statement.executeQuery();
            ArrayList<InvoicesModel> invoicesModels = new ArrayList<InvoicesModel>();
            while (result.next()) {
                id = result.getInt(1);
                String date = result.getString(2);
                int receiverid = result.getInt(3);
                String description = result.getString(4);
                int volume = result.getInt(5);
                InvoicesModel invoicesModel = new InvoicesModel(id, date, receiverid, description, volume);
                invoicesModels.add(invoicesModel);
                invoicesModel.toString();
                LOGGER.info(invoicesModel.toString());
            }
            LOGGER.info("ALL is OK!");
            return invoicesModels;
        } catch (Exception e) {
            LOGGER.info(e);
        }
        return null;
    }


    @Override
    public void deleteInvoicesId(int id) {
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



