package com.example.product.repository;

import com.example.product.model.Department;
import com.example.product.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
    List<Department> findByDepartmentId(Long id);
}
