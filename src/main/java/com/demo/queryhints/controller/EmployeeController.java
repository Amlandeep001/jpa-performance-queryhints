package com.demo.queryhints.controller;

import com.demo.queryhints.entity.Employee;
import com.demo.queryhints.service.EmployeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController
{
    private final EmployeeService service;

    public EmployeeController(EmployeeService service)
    {
        this.service = service;
    }

    @GetMapping("/count")
    public ResponseEntity<String> getTotalEmployeeCount()
    {
        return ResponseEntity.ok("Total employees record counts = " + service.fetchEmployees());
    }

    @GetMapping("/salary/{amount}")
    public ResponseEntity<List<Employee>> getEmployeesBySalaryRange(@PathVariable double amount)
    {
        return ResponseEntity.ok(service.getEmployeesBySalary(amount));
    }
}
