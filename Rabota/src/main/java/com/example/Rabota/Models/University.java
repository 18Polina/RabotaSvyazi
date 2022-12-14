package com.example.Rabota.Models;

import javax.persistence.*;
import java.util.List;

@Entity
public class University {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column
    private String name;
    @ManyToMany
    @JoinTable(name="students_university",
            joinColumns=@JoinColumn(name="university_id"),
            inverseJoinColumns=@JoinColumn(name="students_id"))
    private List<Students> students;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Students> getStudents() {
        return students;
    }

    public void setStudents(List<Students> students) {
        this.students = students;
    }
}
