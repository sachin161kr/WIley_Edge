package com.example.SpringPractice.service;

import com.example.SpringPractice.exception.DepNOTFoundException;
import com.example.SpringPractice.model.Department;

import java.util.List;

public interface DepartmentService {
    public Department createDepartment(Department department);
    public Department saveDepartment(Department department);
    public List<Department> getDepartmentsList();
    public Department getDepartmentById(Long departmentId) throws DepNOTFoundException;
    public Department getDepartmentByName(String departmentName);
    public void deleteDepartmentById(Long departmentId);
    public Department updateDepartment(Long departmentId, Department department);
}
