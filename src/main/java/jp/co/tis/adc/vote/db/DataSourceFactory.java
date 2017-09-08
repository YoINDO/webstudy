package jp.co.tis.adc.vote.db;


import org.h2.jdbcx.JdbcConnectionPool;

import javax.sql.DataSource;


public class DataSourceFactory {

    public static DataSource create() {
        return JdbcConnectionPool.create(
                "jdbc:h2:./h2/test", "sa", "sa");
    }
}
