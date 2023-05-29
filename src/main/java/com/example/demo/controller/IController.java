package com.example.demo.controller;

import com.example.demo.model.Employee;
import org.springframework.web.bind.annotation.*;


public interface IController {
    @PostMapping("/emp")
    String create(@RequestBody Employee employee);

    @GetMapping("/emp/{empId}")
    Employee getEmployee(@PathVariable String empId);

    @PutMapping("/emp")
    String updateEmployee(@RequestBody Employee employee);

    @DeleteMapping("/emp/{empId}")
    String deleteEmp(@PathVariable String empId);
}
