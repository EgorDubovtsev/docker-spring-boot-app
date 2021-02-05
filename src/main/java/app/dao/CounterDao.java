package app.dao;

import app.mapper.CounterMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class CounterDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private CounterMapper counterMapper;

    public void setRequestCount(int currentCount) {
        String changeCounterValue = "UPDATE request_count SET count = ?";
        jdbcTemplate.update(changeCounterValue, currentCount);
    }

    public int getRequestCount() {
        String getAllCounterValuesSql = "SELECT * FROM request_count";
        List<Integer> requestCountList = jdbcTemplate.query(getAllCounterValuesSql, counterMapper);
        return requestCountList.isEmpty() ? 0 : requestCountList.get(0);
    }
}
