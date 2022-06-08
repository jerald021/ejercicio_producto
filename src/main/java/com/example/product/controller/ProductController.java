package com.example.product.controller;

import com.example.product.model.Department;
import com.example.product.model.Product;
import com.example.product.repository.ProductRepository;
import com.example.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
//@RequestMapping("/api/products")
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("find-all")
    @ResponseStatus(HttpStatus.OK)
    public List<Product> findAll() {
        return productService.findAll();
    }

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.I_AM_A_TEAPOT)
    public Product addProduct(@RequestBody @Valid Product product){
        return productService.addProduct(product);
    }

    @GetMapping("/find/{id}")
    @ResponseStatus(HttpStatus.OK)
    public List<Department> findByDepartment(@PathVariable long id) {
        return productService.findByDepartmentId(id);
    }

}
