package com.example.kocickyApp;


import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
    //save(Student), findById(Long), findAll(), ...


//    List<Student> findByVek(Integer vek);
//    List<Student> findByJmenoAndVek(String jmeno, Integer vek );
}