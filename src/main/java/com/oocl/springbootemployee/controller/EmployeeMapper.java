package com.oocl.springbootemployee.controller;

import com.oocl.springbootemployee.model.Employee;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class EmployeeMapper {

    public List<EmployeeResponse> toResponse(List<Employee> employees) {
        return employees.stream().map(employee -> {
            EmployeeResponse employeeResponse = new EmployeeResponse();
            employeeResponse.setName(employee.getName());
            employeeResponse.setAge(employee.getAge());
            employeeResponse.setGender(employee.getGender());
            return employeeResponse;
        }).collect(Collectors.toList());
    }
}
