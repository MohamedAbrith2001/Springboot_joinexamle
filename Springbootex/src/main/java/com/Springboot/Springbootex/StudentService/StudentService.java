package com.Springboot.Springbootex.StudentService;

import com.Springboot.Springbootex.StudentEntity.RoleEntity;
import com.Springboot.Springbootex.StudentEntity.StudentEntity;
import com.Springboot.Springbootex.StudentRepository.RoleRepository;
import com.Springboot.Springbootex.StudentRepository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private RoleRepository roleRepository;

    public StudentEntity saveDetails(StudentEntity studentEntity){
        return studentRepository.save(studentEntity);

    }

    public RoleEntity saveDetails(RoleEntity roleEntity){
        return roleRepository.save(roleEntity);
    }

    public StudentEntity updateDetails(StudentEntity studentEntity){
        StudentEntity update=studentRepository.findById(studentEntity.getAcnt_id()).orElse(null);
        if(update!=null){
            update.setName(studentEntity.getName());
            update.setMail_id(studentEntity.getMail_id());
            update.setAcnt_id(studentEntity.getAcnt_id());
            update.setOrg(studentEntity.getOrg());
            studentRepository.save(update);
        }
        return update;
    }
    public String deleteStudent(int acnt_id){
        studentRepository.deleteById(acnt_id);
        return "deleted";

    }


}
