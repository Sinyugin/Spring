package ru.geekbrains.spring.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentDtos {

    public Long id;
    private String name;
    private int age;
}
