package ua.ithlillel.dnipro.Cherednychenko.firstdb.tables;

import lombok.Data;
import lombok.ToString;

import java.time.LocalDate;

@Data
@ToString
public class Film {
    // поля объектные
    Long id;
    Long directors_id;
    String name;
    String year;

}