package com.example.cms.service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.cms.entity.Customer;
import com.example.cms.exception.UserNotFoundByIdException;
import com.example.cms.repository.CustomerRepository;



@Service
public class CustomerService {

	private final CustomerRepository customerRepository;

	public CustomerService(CustomerRepository customerRepository) {
		super();
		this.customerRepository = customerRepository;
	}



	public Customer saveCustomer(Customer customer) {

		return customerRepository.save(customer);
	}



	public Customer finduser(int id) {

		return customerRepository.findById(id).orElseThrow(()-> new UserNotFoundByIdException("No customer found with the given customer Id"));
	}



	public Customer deleteCustomer(int id) {
		Optional<Customer> optional = customerRepository.findById(id);
		if(optional.isPresent()){
			Customer customer= optional.get();
			customerRepository.delete(customer);
			return customer;
		}else {
			throw new NoSuchElementException("No user found with the given customer Id");
		}

	}


	public Customer updateCustomer(Customer customer) {
		Optional<Customer> optional = customerRepository.findById(customer.getId());
		if(optional.isPresent()) {
			return customerRepository.save(customer);
		}
		else {
			throw new NoSuchElementException("No customer found with the given customer Id");
		}
	}



	public List<Customer> getAll() {

		return customerRepository.findAll();
	}


}



