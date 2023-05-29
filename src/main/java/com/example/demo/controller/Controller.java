package com.example.demo.controller;

import com.example.demo.model.Employee;
import com.example.demo.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller implements IController {

    @Autowired
    private IService service;


    @Override
    public String create(Employee employee) {
        return service.create(employee);
    }

    @Override
    public Employee getEmployee(String empId) {
        return service.getEmployee(empId);
    }

    @Override
    public String updateEmployee(Employee employee) {
        return service.updateEmployee(employee);
    }

    @Override
    public String deleteEmp(String empId) {
        return service.deleteEmp(empId);
    }
}
