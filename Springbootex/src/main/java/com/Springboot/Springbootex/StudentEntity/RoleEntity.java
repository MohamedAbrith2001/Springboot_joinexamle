package com.Springboot.Springbootex.StudentEntity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="role_db")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoleEntity {

    @Id
    @Column(name="ACCOUNT_ID")
    private int acnt_id;
    @Column(name="Department")
    private String dept;
    @Column(name="Domain")
    private String domain;


}
