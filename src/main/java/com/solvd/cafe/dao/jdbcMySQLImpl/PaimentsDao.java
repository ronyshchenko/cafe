package com.solvd.cafe.dao.jdbcMySQLImpl;

import com.solvd.cafe.Util.DataBaseConnection;
import com.solvd.cafe.dao.IPaimentsDao;
import com.solvd.cafe.models.InvoicesModel;
import com.solvd.cafe.models.PaimentsModel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class PaimentsDao implements IPaimentsDao {

    private static final Logger LOGGER = LogManager.getLogger(PaimentsDao.class);
    final String deleteStatementS = "DELETE FROM payments WHERE id=?";
    final String getStatement = "SELECT * FROM payments WHERE id = ?";
    final String insertStatementS = "INSERT INTO payments VALUES (?, ?, ?, ?, ?, ?)";
    final String updateStatementS = "UPDATE payments SET volumefact=? WHERE id=?";
    PreparedStatement stmt = null;


    @Override
    public void createPaiments(PaimentsModel paimentsModel) {
        try (Connection dbConnect = DataBaseConnection.getConnection()) {
            PreparedStatement stmt = dbConnect.prepareStatement(insertStatementS);
            stmt.setInt(1, paimentsModel.getId());
            stmt.setInt(2, paimentsModel.getInvoiceid());
            stmt.setInt(3, paimentsModel.getCurrencyid());
            stmt.setInt(4, paimentsModel.getAccountantid());
            stmt.setInt(5, paimentsModel.getDebt());
            stmt.setInt(6, paimentsModel.getVolumefact());
            int i = stmt.executeUpdate();
            LOGGER.info(i + " records inserted");
        } catch (Exception e) {
            LOGGER.info(e);
        }
    }

    @Override
    public void updatePaiments(int id, int volumefact) {
        try (Connection dbConnect = DataBaseConnection.getConnection()) {
            PreparedStatement stmt = dbConnect.prepareStatement(updateStatementS);
            stmt.setInt(2, id);
            stmt.setInt(1, volumefact);
            int i = stmt.executeUpdate();
            LOGGER.info(i + " records updated");
        } catch (Exception e) {
            LOGGER.info(e);
        }
    }

    @Override
    public void deletePaimentsById(int id) {
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
    public List<PaimentsModel> getPaimentsById(int id) {
        try (Connection con = DataBaseConnection.getConnection()) {
            PreparedStatement statement = con.prepareStatement(getStatement);
            statement.setInt(1, id);
            ResultSet result = statement.executeQuery();
            ArrayList<PaimentsModel> paimentsModels = new ArrayList<PaimentsModel>();
            while (result.next()) {
                id = result.getInt(1);
                int invoiceid = result.getInt(2);
                int currencyid = result.getInt(3);
                int accountantid = result.getInt(4);
                int volumefact = result.getInt(5);
                int debt = result.getInt(6);
                PaimentsModel paimentsModel = new PaimentsModel(id, invoiceid, currencyid, accountantid, volumefact, debt);
                paimentsModels.add(paimentsModel);
                paimentsModel.toString();
                LOGGER.info(paimentsModel.toString());
            }
            LOGGER.info("ALL is OK!");
            return paimentsModels;
        } catch (Exception e) {
            LOGGER.info(e);
        }
        return null;
    }
}
