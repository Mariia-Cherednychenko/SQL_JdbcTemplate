package ua.ithlillel.dnipro.Cherednychenko.firstdb;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import javax.sql.DataSource;

public class DataSourceAccess {

    HikariConfig config;
    DataSource dataSource;


    public DataSourceAccess(String dsn, String user, String password) {
        if(dataSource == null) {
            config = new HikariConfig();
            config.setJdbcUrl(dsn);
            config.setUsername(user);
            config.setPassword(password);
           // config.setMaximumPoolSize(8);
            // config.setMinimumIdle(4);
            this.dataSource = new HikariDataSource(config);
        }

    }

}
