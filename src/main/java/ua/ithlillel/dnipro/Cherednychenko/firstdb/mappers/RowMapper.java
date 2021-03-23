package ua.ithlillel.dnipro.Cherednychenko.firstdb.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

// один единственный метод, который возвращает тип Т, который мы у него попросили и принимает резултСет
// из резултСета создает обект
public  interface RowMapper<T> {
    T map(ResultSet res) throws SQLException; // он с одним методом, чтоб его моно было лямбдой перегружать
}
