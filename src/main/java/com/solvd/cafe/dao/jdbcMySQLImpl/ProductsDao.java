//package com.solvd.cafe.dao.jdbcMySQLImpl;
//
//import com.solvd.cafe.Util.DataBaseConnection;
//import com.solvd.cafe.dao.IProductsDao;
//import com.solvd.cafe.models.PositionsModel;
//import com.solvd.cafe.models.ProductsModel;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//
//import java.sql.*;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.ResourceBundle;
//
//public class ProductsDao implements IProductsDao {
//    private static final Logger LOGGER = LogManager.getLogger(PaimentsDao.class);
//    final String deleteStatementS = "DELETE FROM products WHERE id=?";
//    final String getStatement = "SELECT * FROM products WHERE id = ?";
//    final String insertStatementS = "INSERT INTO products VALUES (?, ?, ?, ?, ?, ?, ?)";
//    final String updateStatementS = "UPDATE products SET name=? WHERE id=?";
//
//    @Override
//    public void createProducts(ProductsModel productsModel) {
//        try (Connection dbConnect = DataBaseConnection.getConnection()) {
//            PreparedStatement stmt = dbConnect.prepareStatement(insertStatementS);
//            stmt.setInt(1, productsModel.getId());
//            stmt.setInt(2, productsModel.getVendid());
//            stmt.setString(3, productsModel.getName());
//            stmt.setFloat(4, productsModel.getPrice());
//            stmt.setString(5, productsModel.getDescription());
//            stmt.setInt(6, productsModel.getRecipeid());
//            stmt.setInt(7, productsModel.getCategoryid());
//            int i = stmt.executeUpdate();
//            LOGGER.info(i + " records inserted");
//        } catch (Exception e) {
//            LOGGER.info(e);
//        }
//    }
//
//    @Override
//    public void updateProducts(int id, String name) {
//        try (Connection dbConnect = DataBaseConnection.getConnection()) {
//            PreparedStatement stmt = dbConnect.prepareStatement(updateStatementS);
//            stmt.setInt(2, id);
//            stmt.setString(1, name);
//            int i = stmt.executeUpdate();
//            LOGGER.info(i + " records updated");
//        } catch (Exception e) {
//            LOGGER.info(e);
//        }
//    }
//
//    @Override
//    public void deleteProductsById(int id) {
//        int x = 0;
//        Connection dbConnect = DataBaseConnection.getConnection();
//        PreparedStatement deleteStatement = null;
//        try {
//            deleteStatement = dbConnect.prepareStatement(deleteStatementS);
//            deleteStatement.setInt(1, id);
//            int i = deleteStatement.executeUpdate();
//            LOGGER.info(i + " records deleted");
//        } catch (SQLException e) {
//            LOGGER.error("ERROR DELETE Appointment WITH ID " + e.getMessage());
//            x = 1;
//        } finally {
//            DataBaseConnection.close(deleteStatement);
//            DataBaseConnection.close(dbConnect);
//            if (x == 0) {
//                LOGGER.info("SUCCESS CLOSE");
//            } else
//                LOGGER.info("FAIL CLOSE");
//        }
//    }
//
//    @Override
//    public List<ProductsModel> getProductsByid(int id) {
//        try (Connection con = DataBaseConnection.getConnection()) {
//            PreparedStatement statement = con.prepareStatement(getStatement);
//            statement.setInt(1, id);
//            ResultSet result = statement.executeQuery();
//            ArrayList<ProductsModel> productsModels = new ArrayList<ProductsModel>();
//            while (result.next()) {
//                id = result.getInt(1);
//                int vendid = result.getInt(2);
//                String name = result.getString(3);
//                int price = result.getInt(4);
//                String description = result.getString(3);
//                int cafeid = result.getInt(5);
//                PositionsModel positionsModel = new PositionsModel(id, nameposition, namedepart, salary, cafeid);
//                positionsModels.add(positionsModel);
//                positionsModel.toString();
//                LOGGER.info(positionsModel.toString());
//            }
//            LOGGER.info("ALL is OK!");
//            return positionsModels;
//        } catch (Exception e) {
//            LOGGER.info(e);
//        }
//        return null;
//    }
//}
