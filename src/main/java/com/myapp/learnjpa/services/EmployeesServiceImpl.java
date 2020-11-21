package com.myapp.learnjpa.services;

import com.myapp.learnjpa.entity.Employees;
import com.myapp.learnjpa.repository.EmployeesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeesServiceImpl implements EmployeesService {

    @Autowired(required = true)
    EmployeesRepository employeesRepository;

    @Override
    public List<Employees> getAllEmployees(String firstName) {
        if (firstName != null)
            return employeesRepository.getEmployeesByFirstNameContaining(firstName);
        else
            return employeesRepository.findAll();
    }

    @Override
    public Page<Employees> getAllEmployeesByLastName(Integer page, Integer pageSize, String lastName) {
        Pageable pageable = PageRequest.of(page, pageSize, Sort.by("lastName").descending());
        if (lastName != null) {
            Page<Employees> pe = employeesRepository.getEmployeesByLastNameContaining(lastName, pageable);
            // change content
            return pe;
        } else {
            return employeesRepository.findAll(pageable);
        }
    }

    /*
    // list<> to page<>
    @Override
    public Page<Employees> getAllEmployeesByLastName(Integer page, Integer pageSize, String lastName) {
        Pageable pageable = PageRequest.of(page, pageSize, Sort.by("lastName").descending());
        if (lastName != null) {
            List<Employees> lstE = employeesRepository.findByLastNameContaining(lastName, pageable);
            //return employeesRepository.getEmployeesByLastNameContaining(lastName, pageable);
            return new PageImpl<>(lstE, pageable, lstE.size());
        } else {
            return employeesRepository.findAll(pageable);
        }
    }*/

}
