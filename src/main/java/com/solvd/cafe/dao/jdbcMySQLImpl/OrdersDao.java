package com.solvd.cafe.dao.jdbcMySQLImpl;

import com.solvd.cafe.Util.DataBaseConnection;
import com.solvd.cafe.dao.IOrdersDao;
import com.solvd.cafe.models.CurrenciesModel;
import com.solvd.cafe.models.OrdersModel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OrdersDao implements IOrdersDao {

    private static final Logger LOGGER = LogManager.getLogger(OrdersDao.class);
    final String deleteStatementS = "DELETE FROM orders WHERE id=?";
    final String getStatement = "SELECT * FROM orders WHERE id = ?";
    final String insertStatementS = "INSERT INTO orders VALUES (?, ?, ?, ?, ?, ?, ?)";
    final String updateStatementS = "UPDATE orders SET quantity=? WHERE id=?";
    PreparedStatement stmt = null;

    @Override
    public void createOrders(OrdersModel ordersModel) {
        try (Connection dbConnect = DataBaseConnection.getConnection()) {
            PreparedStatement stmt = dbConnect.prepareStatement(insertStatementS);
            stmt.setInt(1, ordersModel.getId());
            stmt.setString(2, ordersModel.getDate());
            stmt.setInt(3, ordersModel.getCustid());
            stmt.setInt(4, ordersModel.getCashierid());
            stmt.setInt(5, ordersModel.getProdid());
            stmt.setInt(6, ordersModel.getQuantity());
            stmt.setInt(7, ordersModel.getCourierid());
            int i = stmt.executeUpdate();
            LOGGER.info(i + " records inserted");
        } catch (Exception e) {
            LOGGER.info(e);
        }
    }
    @Override
    public void updateOrders(int id, int quantity) {
        try (Connection dbConnect = DataBaseConnection.getConnection()) {
            PreparedStatement stmt = dbConnect.prepareStatement(updateStatementS);
            stmt.setInt(2, id);
            stmt.setInt(1, quantity);
            int i = stmt.executeUpdate();
            LOGGER.info(i + " records updated");
        } catch (Exception e) {
            LOGGER.info(e);
        }
    }

    @Override
    public void deleteOrdersById(int id) {
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
    public List<OrdersModel> getOrdersById(int id) {
        try (Connection con = DataBaseConnection.getConnection()) {
            PreparedStatement statement = con.prepareStatement(getStatement);
            statement.setInt(1, id);
            ResultSet result = statement.executeQuery();
            ArrayList<OrdersModel> ordersModels = new ArrayList<OrdersModel>();
            while (result.next()) {
                id = result.getInt(1);
                String date = result.getString(2);
                int custid = result.getInt(3);
                int cashierid = result.getInt(4);
                int prodid = result.getInt(5);
                int quantity = result.getInt(6);
                int courierid = result.getInt(7);
                OrdersModel ordersModel = new OrdersModel(id, date, custid, cashierid,
                        prodid, quantity, courierid);
                ordersModels.add(ordersModel);
                ordersModel.toString();
                LOGGER.info(ordersModel.toString());
            }
            LOGGER.info("ALL is OK!");
            return ordersModels;
        } catch (Exception e) {
            LOGGER.info(e);
        }
        return null;
    }

}
