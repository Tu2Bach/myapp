package com.myapp.learnjpa.repository;

import com.myapp.learnjpa.entity.Employees;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeesRepository extends JpaRepository<Employees, Long> {
    List<Employees> getEmployeesByFirstNameContaining(String firstName);

    Page<Employees> getEmployeesByLastNameContaining(String firstName, Pageable pageable);
    List<Employees> findByLastNameContaining(String lastname, Pageable pageable);
}
