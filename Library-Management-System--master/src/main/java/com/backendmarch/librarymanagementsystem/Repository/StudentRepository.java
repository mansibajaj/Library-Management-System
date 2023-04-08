package com.backendmarch.librarymanagementsystem.Repository;

import com.backendmarch.librarymanagementsystem.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository

public interface StudentRepository extends JpaRepository<Student,Integer> {

    //findBy{attribute}.
    Student findByEmail(String email);   // make the custom Query attribute.

    List<Student> findByAge(int age);
}



