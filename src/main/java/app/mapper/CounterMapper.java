package app.mapper;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CounterMapper implements RowMapper<Integer> {
    public Integer mapRow(ResultSet resultSet, int i) throws SQLException {
        return resultSet.getInt(1);
    }
}
