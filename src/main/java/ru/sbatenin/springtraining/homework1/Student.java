package ru.sbatenin.springtraining.homework1;

import lombok.Data;

@Data
public class Student {
    private long id;
    private String name;
    private String groupName;

    public Student(long id, String name, String groupName) {
        this.id = id;
        this.name = name;
        this.groupName = groupName;
    }
}
