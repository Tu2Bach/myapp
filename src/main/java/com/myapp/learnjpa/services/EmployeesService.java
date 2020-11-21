package com.myapp.learnjpa.services;

import com.myapp.learnjpa.entity.Employees;
import org.springframework.data.domain.Page;

import java.util.List;

public interface EmployeesService {
    List<Employees> getAllEmployees(String firstName);
    Page<Employees> getAllEmployeesByLastName(Integer page, Integer pageSize, String lastName);
}
