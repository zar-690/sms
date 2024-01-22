package com.itvedant.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.itvedant.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
