package ua.ithlillel.dnipro.Cherednychenko.firstdb.mappers;

import ua.ithlillel.dnipro.Cherednychenko.firstdb.tables.Director;
import ua.ithlillel.dnipro.Cherednychenko.firstdb.tables.Film;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;

public class FilmRowMapper implements RowMapper<Film> {

    @Override
    public Film map(ResultSet res) throws SQLException {
        Film film = new Film();
        film.setId(res.getLong("id"));
        film.setYear(res.getString("year"));
        film.setName(res.getString("name"));
        film.setDirectors_id(res.getLong("directors_id"));
        return film;
    }
}
