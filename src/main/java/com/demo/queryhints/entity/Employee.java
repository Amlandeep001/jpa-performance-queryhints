package com.demo.queryhints.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "emp", schema = "test")
public class Employee
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String dept;
    String email;
    String gender;
    double salary;

    public Employee(String name, String dept, String email, String gender, double salary)
    {
        this.name = name;
        this.dept = dept;
        this.email = email;
        this.gender = gender;
        this.salary = salary;
    }
}
