package com.example.demo.student;

import java.time.LocalDate;

public class Student {
    private Integer age;
    private Long Id;
    private String name;
    private String email;
    private LocalDate dob;

    public Student( Long id, String name, String email, LocalDate dob,Integer age){
        this.age = age;
        Id = id;
        this.name = name;
        this.email = email;
        this.dob = dob;
    }

    public Student( String name, String email, LocalDate dob, Integer age) {
        this.age = age;
        this.name = name;
        this.email = email;
        this.dob = dob;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Student(){}
}
