package com.solvd.cafe.dao.jdbcMySQLImpl;

import com.solvd.cafe.Util.DataBaseConnection;
import com.solvd.cafe.dao.ICafeDao;
import com.solvd.cafe.models.CafeModel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CafeDao implements ICafeDao {
    private static final Logger LOGGER = LogManager.getLogger(CurrenciesDao.class);
    final String deleteStatementS = "DELETE FROM cafe WHERE id=?";
    final String getStatement = "SELECT * FROM cafe WHERE id = ?";
    final String insertStatementS = "INSERT INTO cafe VALUES (?, ?, ?, ?, ?)";
    final String updateStatementS = "UPDATE cafe SET name=? WHERE id=?";
    final String updateStatementSMyBatis = "UPDATE cafe SET name=?  SET address=? SET site=? SET email=? WHERE id=?";
    PreparedStatement stmt = null;


    @Override
    public void createCafe(CafeModel cafeModel) {
        Connection dbConnect = DataBaseConnection.getConnection();
        try {
            stmt = dbConnect.prepareStatement(insertStatementS);
            stmt.setInt(1, cafeModel.getId());
            stmt.setString(2, cafeModel.getName());
            stmt.setString(3, cafeModel.getAddress());
            stmt.setString(4, cafeModel.getSite());
            stmt.setString(5, cafeModel.getEmail());
            int i = stmt.executeUpdate();
            LOGGER.info(i + " records inserted");
        } catch (Exception e) {
            LOGGER.info(e);
        } finally {
            try {
                DataBaseConnection.close(dbConnect);
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void updateCafe(int id, String name) {
        Connection dbConnect = DataBaseConnection.getConnection();
        try {
            stmt = dbConnect.prepareStatement(updateStatementS);
            stmt.setString(1, name);
            stmt.setInt(2, id);
            int i = stmt.executeUpdate();
            LOGGER.info(i + " records updated");
        } catch (Exception e) {
            LOGGER.info(e);
        } finally {
            try {
                DataBaseConnection.close(dbConnect);
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void updateCafeMyBatis(CafeModel cafeModel) {
        Connection dbConnect = DataBaseConnection.getConnection();
        try {
            stmt = dbConnect.prepareStatement(updateStatementSMyBatis);
            stmt.setString(1, cafeModel.getName());
            stmt.setString(2, cafeModel.getAddress());
            stmt.setString(3, cafeModel.getSite());
            stmt.setString(4, cafeModel.getEmail());
            stmt.setInt(2, cafeModel.getId());
            int i = stmt.executeUpdate();
            LOGGER.info(i + " records updated");
        } catch (Exception e) {
            LOGGER.info(e);
        } finally {
            try {
                DataBaseConnection.close(dbConnect);
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void deleteCafeById(int id) {
        Connection dbConnect = DataBaseConnection.getConnection();
        int x = 0;
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
    public List<CafeModel> getCafeById(int id) {
        Connection dbConnect = DataBaseConnection.getConnection();
       try  {
            stmt = dbConnect.prepareStatement(getStatement);
            stmt.setInt(1, id);
            ResultSet result = stmt.executeQuery();
            ArrayList<CafeModel> cafeModels = new ArrayList<CafeModel>();
            while (result.next()) {
                id = result.getInt(1);
                String name = result.getString(2);
                String address = result.getString(3);
                String site = result.getString(4);
                String email = result.getString(5);
                CafeModel cafeModel = new CafeModel(id, name, address, site, email);
                cafeModels.add(cafeModel);
                cafeModel.toString();
                LOGGER.info(cafeModel.toString());
            }
            LOGGER.info("ALL is OK!");
            return cafeModels;
        } catch (Exception e) {
            LOGGER.info(e);
        } finally {
           try {
               DataBaseConnection.close(dbConnect);
               stmt.close();
           } catch (SQLException e) {
               e.printStackTrace();
           }
       }
        return null;
    }


}


