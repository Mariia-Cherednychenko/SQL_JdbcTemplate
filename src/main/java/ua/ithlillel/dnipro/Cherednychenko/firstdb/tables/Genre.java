package ua.ithlillel.dnipro.Cherednychenko.firstdb.tables;

import lombok.Data;
import lombok.ToString;

import java.time.LocalDate;

@Data
@ToString
public class Genre {
    // поля объектные
    Long id;
    String name;

}