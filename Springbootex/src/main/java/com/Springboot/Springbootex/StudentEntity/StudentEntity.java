package com.Springboot.Springbootex.StudentEntity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name="Student_db")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentEntity {
    @Id
    @Column(name="ACCOUNT_ID")
    private int acnt_id;
    @Column(name="Name")
    private String name;
    @Column(name="MAIL_ID")
    private String mail_id;
    @Column(name="ORGANISATION")
    private String org;


   @CreationTimestamp
    @Column(name="CREATED_ON")
    private LocalDateTime createdon;

    @UpdateTimestamp
    @Column(name="UPDATED_ON")
    private LocalDateTime updatedon;

}
