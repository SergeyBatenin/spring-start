package ru.sbatenin.springtraining.homework1;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class StudentRepository {
    private final List<Student> students;

    public StudentRepository() {
        this.students = List.of(
                new Student(1, "Alexandr", "groupTest"),
                new Student(2, "Alexey", "group2"),
                new Student(3, "Michel", "group3"),
                new Student(4, "Anna", "group4"),
                new Student(5, "Yulia", "groupTest"),
                new Student(6, "Sergey", "group2"),
                new Student(7, "Tatiana", "group3"),
                new Student(8, "Maria", "group4"),
                new Student(9, "MyAlexTestName", "groupTest"),
                new Student(10, "Petr", "groupTest")
        );
    }

    public List<Student> getAll() {
        return List.copyOf(students);
    }

    public Student getByid(long id) {
        return students.stream()
                .filter(student -> student.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public List<Student> getByGroupName(String groupName) {
        return students.stream()
                .filter(student -> student.getGroupName().equalsIgnoreCase(groupName))
                .collect(Collectors.toList());
    }

    public List<Student> getStudentsWithNameContainsSubName(String studentSubName) {
        return students.stream()
                .filter(student -> student.getName().contains(studentSubName))
                .collect(Collectors.toList());
    }
}
