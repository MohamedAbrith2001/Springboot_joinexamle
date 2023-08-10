package com.Springboot.Springbootex.StudentRepository;

import com.Springboot.Springbootex.StudentEntity.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<RoleEntity, Integer> {
}
