package ru.geekbrains.spring.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.geekbrains.spring.entities.Student;
import ru.geekbrains.spring.entities.StudentDtos;
import ru.geekbrains.spring.service.StudentService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/studentslist")
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;

    @GetMapping
    public List<StudentDtos> findAllStudent() {
        return studentService.findAll().stream().map(s -> new StudentDtos(s.getId(), s.getName(), s.getAge())).collect(Collectors.toList());
    }

    @GetMapping("{id}")
    public StudentDtos findStudentById(@PathVariable Long id) {
        Student s = studentService.findById(id).orElseThrow();
        return new StudentDtos(s.getId(), s.getName(), s.getAge());
    }

    @DeleteMapping("delete/{id}")
    public void deleteStudentById(@PathVariable Long id) {
        studentService.deleteById(id);
    }
}
