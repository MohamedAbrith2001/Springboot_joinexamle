package com.Springboot.Springbootex.StudentRepository;

import com.Springboot.Springbootex.StudentEntity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentEntity , Integer> {
}

