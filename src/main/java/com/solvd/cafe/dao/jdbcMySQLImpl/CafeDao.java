package com.solvd.cafe.dao.jdbcMySQLImpl;

import com.solvd.cafe.Util.ConnectionManager;
import com.solvd.cafe.dao.ICafeDao;
import com.solvd.cafe.exeption.DaoExeption;
import com.solvd.cafe.models.CafeModel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.*;

public class CafeDao implements ICafeDao {

    private static final String DELETE_SQL = "DELETE FROM cafe WHERE id = ?";
    private static final String SAVE_SQL = "INSERT INTO cafe (id, name, address, site, mail) VALUES (?,?,?,?,?)";

    private static final Logger LOGGER = LogManager.getLogger(CafeDao.class);

    @Override
    public void create(int id, String address, String email, String name, String site) {
        try(var connection = ConnectionManager.open();
            var preparedStatement = connection.prepareStatement(SAVE_SQL)){
            preparedStatement.setString(1, String.valueOf(id));
            preparedStatement.setString(2, address);
            preparedStatement.setString(3, email);
            preparedStatement.setString(4, name);
            preparedStatement.setString(5, site);

        } catch (SQLException throwables) {
        throw new DaoExeption(throwables);
        }
}
    @Override
    public void update(String appointmentDate, int id) {

    }

    @Override
    public int delete(int id) {
        try (var connection = ConnectionManager.open();

             var preparedStatement = connection.prepareStatement(DELETE_SQL)) {
            preparedStatement.setInt(1, id);
            int i = preparedStatement.executeUpdate();
            return i;

        } catch (SQLException throwables) {
            throw new DaoExeption(throwables);
        }
    }

    @Override
    public CafeModel getCafeByName(String name) {
        return null;
    }
}
