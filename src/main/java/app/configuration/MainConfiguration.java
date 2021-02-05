package app.configuration;

import app.dao.CounterDao;
import app.mapper.CounterMapper;
import app.service.RequestCountService;
import app.service.SimpleRequestCountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Configuration
public class MainConfiguration {
    @Bean
    public Logger logger(){
        return LoggerFactory.getLogger("LOGGER");
    }
    @Bean
    public CounterDao counterDao(){
        return new CounterDao();
    }
    @Bean
    public RequestCountService requestCountService(){
        return new SimpleRequestCountService();
    }
    @Bean
    public CounterMapper counterMapper(){
        return new CounterMapper();
    }

}
