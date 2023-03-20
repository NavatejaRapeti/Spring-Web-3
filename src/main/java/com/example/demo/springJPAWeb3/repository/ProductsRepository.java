package com.example.demo.springJPAWeb3.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.springJPAWeb3.data.entity.Products;



public interface ProductsRepository extends CrudRepository<Products, Integer> {
}
