package com.example.Student.SpringBootProject.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Student.SpringBootProject.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
