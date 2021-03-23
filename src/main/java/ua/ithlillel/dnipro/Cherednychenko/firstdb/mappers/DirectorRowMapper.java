package ua.ithlillel.dnipro.Cherednychenko.firstdb.mappers;

import ua.ithlillel.dnipro.Cherednychenko.firstdb.tables.Director;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;

public class DirectorRowMapper implements RowMapper<Director> {

    @Override
    public Director map(ResultSet res) throws SQLException {
        Director director = new Director();
        director.setId(res.getLong("id"));
        director.setBirth_date(res.getObject("birth_date", LocalDateTime.class).toLocalDate());
        director.setName(res.getString("name"));
        director.setSurname(res.getString("surname"));
        return director;
    }
}
