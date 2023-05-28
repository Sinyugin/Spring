package ru.geekbrains.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.geekbrains.spring.entities.Student;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Long> {
    Optional<Student> findByName(String name);
}
