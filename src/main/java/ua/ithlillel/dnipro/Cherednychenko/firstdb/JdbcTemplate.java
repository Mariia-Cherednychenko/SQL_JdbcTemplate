package ua.ithlillel.dnipro.Cherednychenko.firstdb;


import ua.ithlillel.dnipro.Cherednychenko.firstdb.exception.DataBaseOperationException;
import ua.ithlillel.dnipro.Cherednychenko.firstdb.mappers.RowMapper;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JdbcTemplate {
    DataSource dataSource;

    public JdbcTemplate(DataSource dataSource) {
            this.dataSource = dataSource;

    }

    //методы для выборки данных

    //Выборка нескольких записей
    public <T> List<T> query(String sql, Object[] params, RowMapper<T> mapper){

            try {
                Connection connection = dataSource.getConnection();
                PreparedStatement statement = connection.prepareStatement(sql);
                for (int i = 0; i < params.length; i++) {
                    statement.setObject(i+1, params[i]);
                }
                ResultSet res = statement.executeQuery();
                List<T> resultList = new ArrayList<>();

                while (res.next())
                {
                    T obj = mapper.map(res);
                    resultList.add(obj);
                }
                connection.close();
                return resultList;

            } catch (Exception e) {
                new DataBaseOperationException("Исключение при выборке нескольких записей");
                return  null;
        }
    }

    //Выборка нескольких записей
    //вызывает первый передавая пустой массив параметров
    public <T> List<T> query(String sql, RowMapper<T> mapper){
         return query(sql, new Object[]{}, mapper);
    }

    //Выборка одной записи (возвращают первую выбранную запись)
    public <T> T queryOne(String sql, Object[] params, RowMapper<T> mapper){
        try {
            Connection connection = dataSource.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            for (int i = 0; i < params.length; i++) {
                statement.setObject(i+1, params[i]);
            }
            ResultSet res = statement.executeQuery();

            T result =null;
            while (res.next())
            {
                result = mapper.map(res);
                break;
            }

            connection.close();
            return result;

        } catch (Exception e) {
            new DataBaseOperationException("Исключение при выборке одной записи");
            return  null;
        }

    }

    //Выборка одной записи (возвращают первую выбранную запись)
    //- вызывает первый передавая пустой массив параметров
    public <T> T queryOne(String sql, RowMapper<T> mapper){
        return queryOne(sql, new Object[]{}, mapper);
    }

    //Для операций не возвращающих результат (INSERT,UPDATE,DELETE )
    public void update(String sql, Object[] params){
        try {
            Connection connection = dataSource.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            for (int i = 0; i < params.length; i++) {
                statement.setObject(i+1, params[i]);
            }

            statement.executeUpdate();
            connection.close();


        } catch (Exception e) {
            new DataBaseOperationException("Исключение для операций не возвращающих результат");

        }
    }

    //Для операций не возвращающих результат (INSERT,UPDATE,DELETE )
    //- вызывает первый передавая пустой массив параметров
    public void update(String sql){
        update(sql, new Object[]{});
    }

}
