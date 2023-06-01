package com.example.SpringPractice.service;

import com.example.SpringPractice.exception.DepNOTFoundException;
import com.example.SpringPractice.model.Department;
import com.example.SpringPractice.repository.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentRepo depRepo;
    @Override
    public Department createDepartment(Department department) {
        return depRepo.save(department);
    }

    @Override
    public Department saveDepartment(Department department) {
        return null;
    }

    @Override
    public List<Department> getDepartmentsList() {
        return depRepo.findAll();
    }

    @Override
    public Department getDepartmentById(Long departmentId) throws DepNOTFoundException {
        Optional<Department> dep = depRepo.findById(departmentId);

        if(!dep.isPresent())
        {
            throw new DepNOTFoundException("Department not found");
        }

        return dep.get();
    }


    @Override
    public Department getDepartmentByName(String departmentName) {
        return depRepo.findByDepartmentName(departmentName);
    }

    @Override
    public void deleteDepartmentById(Long departmentId) {

        depRepo.deleteById(departmentId);

    }

    @Override
    public Department updateDepartment(Long departmentId, Department department) {
         Department dep = depRepo.findById(departmentId).get();

         if(Objects.nonNull(dep.getDepartmentName()) &&  !"".equalsIgnoreCase(department.getDepartmentName()))
         {
             dep.setDepartmentName(department.getDepartmentName());
         }

            if(Objects.nonNull(dep.getDepartmentCode()) &&  !"".equalsIgnoreCase(department.getDepartmentCode()))
            {
                dep.setDepartmentCode(department.getDepartmentCode());
            }

            if(Objects.nonNull(dep.getDepartmentAddress()) &&  !"".equalsIgnoreCase(department.getDepartmentAddress()))
            {
                dep.setDepartmentAddress(department.getDepartmentAddress());
            }

        return depRepo.save(department);
    }
}
