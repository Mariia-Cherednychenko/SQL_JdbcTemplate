package ua.ithlillel.dnipro.Cherednychenko.firstdb.mappers;

import ua.ithlillel.dnipro.Cherednychenko.firstdb.tables.Film;
import ua.ithlillel.dnipro.Cherednychenko.firstdb.tables.Genre;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;

public class GenreRowMapper implements RowMapper<Genre> {

    @Override
    public Genre map(ResultSet res) throws SQLException {
        Genre genre = new Genre();
        genre.setId(res.getLong("id"));
        genre.setName(res.getString("name"));
        return genre;
    }
}
