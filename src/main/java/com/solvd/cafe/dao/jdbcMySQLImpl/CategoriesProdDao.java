package com.solvd.cafe.dao.jdbcMySQLImpl;

import com.solvd.cafe.Util.DataBaseConnection;
import com.solvd.cafe.dao.ICategoriesProdDao;
import com.solvd.cafe.models.CategoriesProdModel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.*;
import java.util.List;

public class CategoriesProdDao implements ICategoriesProdDao {

    private static final Logger LOGGER = LogManager.getLogger(CategoriesProdDao.class);
    final String deleteStatementS = "DELETE FROM categoriesprod WHERE id=?";
    final String getStatement = "SELECT * FROM categoriesprod WHERE id = ?";
    final String insertStatementS = "INSERT INTO categoriesprod VALUES (?, ?, ?)";
    final String updateStatementS = "UPDATE categoriesprod SET name=? WHERE id=?";


    @Override
    public void createCategoriesProd(CategoriesProdModel categoriesProdModel) {
        try (Connection dbConnect = DataBaseConnection.getConnection()) {
            PreparedStatement stmt = dbConnect.prepareStatement(insertStatementS);
            stmt.setInt(1, categoriesProdModel.getId());
            stmt.setString(2, categoriesProdModel.getName());
            stmt.setString(3, categoriesProdModel.getDescription());
            int i = stmt.executeUpdate();
            LOGGER.info(i + " records inserted");
        } catch (Exception e) {
            LOGGER.info(e);
        }
    }
    @Override
    public void updateCategoriesProd(int id, String name) {
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
    public void deleteCategoriesProdById(int id) {
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

//    @Override
//    public List<OrdersModel> getOrdersById(int id) {
//        try (Connection con = DataBaseConnection.getConnection()) {
//            PreparedStatement statement = con.prepareStatement(getStatement);
//            statement.setInt(1, id);
//            ResultSet result = statement.executeQuery();
//            ArrayList<OrdersModel> ordersModels = new ArrayList<OrdersModel>();
//            while (result.next()) {
//                id = result.getInt(1);
//                String date = result.getString(2);
//                int custid = result.getInt(3);
//                int cashierid = result.getInt(4);
//                int prodid = result.getInt(5);
//                int quantity = result.getInt(6);
//                int courierid = result.getInt(7);
//                OrdersModel ordersModel = new OrdersModel(id, cashierid, courierid,
//                        custid, date, prodid, quantity);
//                ordersModels.add(ordersModel);
//                ordersModel.toString();
//                LOGGER.info(ordersModel.toString());
//            }
//            LOGGER.info("ALL is OK!");
//            return ordersModels;
//        } catch (Exception e) {
//            LOGGER.info(e);
//        }
//        return null;
//    }
//






    @Override
    public List<CategoriesProdModel> getCategoriesProdId(int id) {
        return null;
    }


}
