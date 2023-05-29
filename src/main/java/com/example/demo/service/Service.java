package com.example.demo.service;


import com.example.demo.model.Employee;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Service
public class Service implements IService {
    private static List<Employee> employees = new ArrayList<>();
    @Override
    public String create(Employee employee) {
        employees.add(employee);
        return "Record Added";
    }

    @Override
    public Employee getEmployee(String  empId) {
        for(Employee employee: employees){
            if(employee.getId()==Integer.parseInt(empId))
                return employee;
        }
        return null;
    }

    @Override
    public String updateEmployee(Employee employee) {
        for(Employee emp: employees){
            if(employee.getId()==employee.getId()){
                emp.setDepartment(employee.getDepartment());
                emp.setName(employee.getName());
                return "Record updated";
            }
        }
        return null;
    }

    @Override
    public String deleteEmp(String empId) {
        for(Employee employee: employees){
            if(employee.getId()==Integer.parseInt(empId)) {
                employees.remove(employee);
                return "Record Deleted";
            }

        }
        return null;
    }
}
