package com.demo.queryhints.service;

import com.demo.queryhints.entity.Employee;
import com.demo.queryhints.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService
{
    private final EmployeeRepository repository;

    public EmployeeService(EmployeeRepository repository)
    {
        this.repository = repository;
    }

    public Long fetchEmployees()
    {
        return repository.count();
    }

    public List<Employee> getEmployeesBySalary(double salary)
    {
        return repository.findEmployeesWithSalaryGreaterThan(salary);
    }
}
