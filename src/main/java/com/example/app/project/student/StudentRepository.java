package com.example.app.project.student;

import org.springframework.data.jpa.repository.JpaRepository;

@Deprecated
public interface StudentRepository extends JpaRepository<Student, Long> {


}
