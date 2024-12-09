package com.example.kocickyApp;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.ToString;

@Entity

@Getter
@ToString
public class Student {
    @Id
    @GeneratedValue
    private Long id;

    private String jmeno;
    private Integer vek;

//    protected Student() { }

    public Student() {

    }

    public Student(String jmeno, Integer vek) {
        this.jmeno = jmeno;
        this.vek = vek;
    }

}
