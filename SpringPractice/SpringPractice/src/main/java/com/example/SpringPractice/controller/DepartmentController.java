package com.example.SpringPractice.controller;

import com.example.SpringPractice.exception.DepNOTFoundException;
import com.example.SpringPractice.model.Department;
import com.example.SpringPractice.service.DepartmentService;
import com.example.SpringPractice.service.DepartmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService depService;
    @GetMapping("/departments")
    public List<Department> getAllDepartments(){

        return depService.getDepartmentsList();
    }
    @PostMapping("/departments")
    public Department createDepartment(@RequestBody Department department){
        return depService.createDepartment(department);
    }

    @GetMapping("/departments/{id}")
    public Department getDepartmentById(@PathVariable("id") Long departmentId) throws DepNOTFoundException {
        return depService.getDepartmentById(departmentId);
    }

    @DeleteMapping("/deleteDepartment/{id}")
    public void deleteDepartmentById(@PathVariable("id") Long departmentId){
        depService.deleteDepartmentById(departmentId);
    }

    @GetMapping("/departments/name/{name}")
    public Department getDepartmentByName(@PathVariable("name") String departmentName){
        return depService.getDepartmentByName(departmentName);
    }

    @PutMapping("/updateDepartments")
    public Department updateDepartment(@RequestBody Department department){
        return depService.updateDepartment(department.getDepartmentId(),department);
    }



}
