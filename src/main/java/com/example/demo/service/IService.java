package com.example.demo.service;

import com.example.demo.model.Employee;
import org.springframework.web.bind.annotation.*;

public interface IService {

    String create(@RequestBody Employee employee);


    Employee getEmployee(@PathVariable String empId);


    String updateEmployee(@RequestBody Employee employee);

    String deleteEmp(@PathVariable String empId);
}
