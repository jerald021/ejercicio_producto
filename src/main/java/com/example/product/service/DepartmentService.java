package com.example.product.service;

import com.example.product.model.Department;
import com.example.product.repository.DepartmentRepository;
import com.example.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

@Service
public class DepartmentService {
    @Autowired
    DepartmentRepository departmentRepository;

    @GetMapping("/find/{id}")
    @ResponseStatus(HttpStatus.OK)
    public List<Department> findByDepartment(@PathVariable long id) {
        return departmentRepository.findByDepartmentId(id);
    }
}
