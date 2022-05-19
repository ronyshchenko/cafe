package com.solvd.cafe.dao.jdbcMySQLImpl;

import com.solvd.cafe.Util.DataBaseConnection;
import com.solvd.cafe.dao.IPositionsDao;
import com.solvd.cafe.models.PaimentsModel;
import com.solvd.cafe.models.PositionsModel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class PositionsDao implements IPositionsDao {
    private static final Logger LOGGER = LogManager.getLogger(PaimentsDao.class);
    final String deleteStatementS = "DELETE FROM positions WHERE id=?";
    final String getStatement = "SELECT * FROM positions WHERE id = ?";
    final String insertStatementS = "INSERT INTO positions VALUES (?, ?, ?, ?, ?)";
    final String updateStatementS = "UPDATE positions SET salary=? WHERE id=?";
    PreparedStatement stmt = null;



    @Override
    public void createPositions(PositionsModel positionsModel) {
        try (Connection dbConnect = DataBaseConnection.getConnection()) {
            PreparedStatement stmt = dbConnect.prepareStatement(insertStatementS);
            stmt.setInt(1, positionsModel.getId());
            stmt.setString(2, positionsModel.getNamepositions());
            stmt.setString(3, positionsModel.getNamedepart());
            stmt.setInt(4, positionsModel.getSalary());
            stmt.setInt(5, positionsModel.getCafeid());
            int i = stmt.executeUpdate();
            LOGGER.info(i + " records inserted");
        } catch (Exception e) {
            LOGGER.info(e);
        }
    }

    @Override
    public void updatePositions(int id, int salary) {
        try (Connection dbConnect = DataBaseConnection.getConnection()) {
            PreparedStatement stmt = dbConnect.prepareStatement(updateStatementS);
            stmt.setInt(2, id);
            stmt.setInt(1, salary);
            int i = stmt.executeUpdate();
            LOGGER.info(i + " records updated");
        } catch (Exception e) {
            LOGGER.info(e);
        }
    }





    @Override
    public void deletePositionsById(int id) {
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
    public List<PositionsModel> getPositionsById(int id) {
        try (Connection con = DataBaseConnection.getConnection()) {
            PreparedStatement statement = con.prepareStatement(getStatement);
            statement.setInt(1, id);
            ResultSet result = statement.executeQuery();
            ArrayList<PositionsModel> positionsModels = new ArrayList<PositionsModel>();
            while (result.next()) {
                id = result.getInt(1);
                String nameposition = result.getString(2);
                String namedepart = result.getString(3);
                int salary = result.getInt(4);
                int cafeid = result.getInt(5);
                PositionsModel positionsModel = new PositionsModel(id, nameposition, namedepart, salary, cafeid);
                positionsModels.add(positionsModel);
                positionsModel.toString();
                LOGGER.info(positionsModel.toString());
            }
            LOGGER.info("ALL is OK!");
            return positionsModels;
        } catch (Exception e) {
            LOGGER.info(e);
        }
        return null;
    }


}
