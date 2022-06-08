package com.example.product.service;

import com.example.product.model.Department;
import com.example.product.model.Product;
import com.example.product.repository.DepartmentRepository;
import com.example.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;
    DepartmentRepository departmentRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Product addProduct(Product product){
        return productRepository.save(product);
    }
    public List<Department> findAllByDepartmentId(Long id ){
        return departmentRepository.findByDepartmentId(id);
    }


}
