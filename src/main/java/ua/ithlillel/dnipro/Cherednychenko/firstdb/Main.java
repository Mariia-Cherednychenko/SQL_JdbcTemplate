package ua.ithlillel.dnipro.Cherednychenko.firstdb;

import ua.ithlillel.dnipro.Cherednychenko.firstdb.mappers.DirectorRowMapper;
import ua.ithlillel.dnipro.Cherednychenko.firstdb.mappers.FilmRowMapper;
import ua.ithlillel.dnipro.Cherednychenko.firstdb.mappers.GenreRowMapper;
import ua.ithlillel.dnipro.Cherednychenko.firstdb.tables.Director;
import ua.ithlillel.dnipro.Cherednychenko.firstdb.tables.Film;
import ua.ithlillel.dnipro.Cherednychenko.firstdb.tables.Genre;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        String dsn = "jdbc:postgresql://localhost:5432/postgres";
        String user = "postgres";
        String password = "0000";

        DataSourceAccess access = new DataSourceAccess(dsn, user, password);
        JdbcTemplate template = new JdbcTemplate(access.dataSource);

       /* List<Director> directorList = template.query(
                "SELECT id, name, surname,birth_date FROM directors WHERE id=?",
                new Object[]{1},
                new DirectorRowMapper()
        );
        directorList.forEach(System.out::println);

        List<Film> filmList = template.query(
                "SELECT id, name, year, directors_id FROM films WHERE id=?",
                new Object[]{1},
                new FilmRowMapper()
        );
        filmList.forEach(System.out::println);

        List<Genre> genreList = template.query(
                "SELECT id, name FROM genres WHERE id=?",
                new Object[]{1},
                new GenreRowMapper()
        );
        genreList.forEach(System.out::println);

        List<Film> filmList2 = template.query(
                "SELECT id, name, year, directors_id FROM films",
                new FilmRowMapper()
        );
        filmList2.forEach(System.out::println);

        Director firstDirector = template.queryOne(
                "SELECT id, name, surname,birth_date FROM directors WHERE id=?",
                new Object[]{1},
                new DirectorRowMapper()
        );
        System.out.println(firstDirector);

        Film secondFilm = template.queryOne(
                "SELECT id, name, year, directors_id FROM films WHERE id=?",
                new Object[]{2},
                new FilmRowMapper()
        );
        System.out.println(secondFilm);;

        Genre thirdGenre = template.queryOne(
                "SELECT id, name FROM genres WHERE id=?",
                new Object[]{3},
                new GenreRowMapper()
        );
        System.out.println(thirdGenre);

      Genre someGenre = template.queryOne(
                "SELECT id, name FROM genres",
                new GenreRowMapper()
        );
        System.out.println(someGenre);

        template.update("INSERT INTO genres (name) VALUES ('thriller')");

        List<Genre> genreAllList = template.query(
                "SELECT id, name FROM genres",
                new GenreRowMapper()
        );
        genreAllList.forEach(System.out::println);
    */
    }
}
