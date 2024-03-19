package ru.sbatenin.springtraining.homework1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    private StudentRepository repository;

    @Autowired
    public StudentController(StudentRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/student")
    public List<Student> getAll() {
        return repository.getAll();
    }

    @GetMapping("/student/{id}")
    public Student getById(@PathVariable long id) {
        return repository.getByid(id);
    }

    @GetMapping("/group/{groupName}/student")
    public List<Student> getAllByGroupName(@PathVariable String groupName) {
        return repository.getByGroupName(groupName);
    }

    @GetMapping("/student/search")
    public List<Student> getAllWithNameExistSubstring(@RequestParam String name) {
        return repository.getStudentsWithNameContainsSubName(name);
    }

    @GetMapping
    public String mainPage() {
        return "Базовая страница";
    }
}
