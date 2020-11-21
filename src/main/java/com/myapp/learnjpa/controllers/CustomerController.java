package com.myapp.learnjpa.controllers;

import com.myapp.learnjpa.dto.CustomerDTO;
import com.myapp.learnjpa.entity.Customer;
import com.myapp.learnjpa.entity.Employees;
import com.myapp.learnjpa.services.CustomerService;
import com.myapp.learnjpa.services.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api")
public class CustomerController {

    @Autowired(required = true)
    private CustomerService customerService;

    @Autowired(required = true)
    private EmployeesService employeesService;

    /*
     * Mapping url exmaple: http:/localhost:8080/api/findAll
     */
    @GetMapping(path = "/findAll")
    @ResponseBody
    public Iterable<Customer> findAllUser() {
        return customerService.getAllCustomers();
    }

    @GetMapping(path = "/findAlls")
    @ResponseBody
    public ResponseEntity<List<Customer>> listAllCustomer(){
        List<Customer> listCustomer = (List<Customer>) customerService.getAllCustomers();
        if(listCustomer.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        //return ResponseEntity<List<Contact>>(listContact, HttpStatus.OK);
        return new ResponseEntity<List<Customer>>(listCustomer, HttpStatus.OK);
    }

    @PostMapping(path = "/findByName")
    @ResponseBody
    public ResponseEntity<List<CustomerDTO>> searchCustomerByName(@RequestParam(name = "custName") String custName) {
        List<CustomerDTO> lst = customerService.getCustomerByName(custName);
        if (lst.isEmpty())
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);

        return new ResponseEntity<List<CustomerDTO>>(lst, HttpStatus.OK);
    }

    @GetMapping(path = "/getAllEmployees")
    @ResponseBody
    public ResponseEntity<List<Employees>> getAllEmployees(@RequestParam(name = "firstName") String firstName){
        List<Employees> lst = employeesService.getAllEmployees(firstName);
        if(lst.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity(lst, HttpStatus.OK);
    }

    @GetMapping(path = "/getAllEmployeesByLastName")
    @ResponseBody
    public ResponseEntity getAllEmployees(@RequestParam(name = "page") Integer page, @RequestParam(name = "pageSize") Integer pageSize, @RequestParam(name = "lastName") String lastName){
        Page<Employees> lst = employeesService.getAllEmployeesByLastName(page, pageSize, lastName);
        if(lst.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity(lst, HttpStatus.OK);
    }
}
