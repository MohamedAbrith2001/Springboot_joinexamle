package com.Springboot.Springbootex.StudentController;


import com.Springboot.Springbootex.StudentEntity.RoleEntity;
import com.Springboot.Springbootex.StudentEntity.StudentEntity;
import com.Springboot.Springbootex.StudentService.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;
    @PostMapping("/addstudent")
    public  StudentEntity postDetails(@RequestBody StudentEntity studentEntity){
     return studentService.saveDetails(studentEntity);
    }
    @PostMapping("/addrole")
    public RoleEntity postDetails(@RequestBody RoleEntity roleEntity){
        return studentService.saveDetails(roleEntity);
    }
    @PutMapping("/updatestudent")
    public StudentEntity updateDetails(@RequestBody StudentEntity studentEntity){
        return studentService.updateDetails(studentEntity);
    }
    @DeleteMapping("/deletestudent/{acnt_id}")
    public String deleteDetails(@PathVariable int acnt_id){
        return studentService.deleteStudent(acnt_id);
    }

}
