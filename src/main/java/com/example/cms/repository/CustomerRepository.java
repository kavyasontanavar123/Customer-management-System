package com.example.cms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cms.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
