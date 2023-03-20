package com.example.demo.springJPAWeb3.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.springJPAWeb3.data.entity.Sales;




public interface SalesRepository extends CrudRepository<Sales, Integer> {
}