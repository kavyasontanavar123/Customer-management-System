package com.example.cms.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.cms.entity.Customer;
import com.example.cms.service.CustomerService;
import com.example.cms.util.ResponseStructure;





@RestController
public class CustomerController {
	private final CustomerService customerService;

	public CustomerController(CustomerService customerService) {
		super();
		this.customerService = customerService;
	}
	
	@PostMapping("/save-customer")
	public ResponseEntity<ResponseStructure<Customer>>saveCustomer(@RequestBody Customer customer){
		customer = customerService.saveCustomer(customer);
		return ResponseEntity
				.status(HttpStatus.CREATED)
				.body(ResponseStructure.create(HttpStatus.CREATED.value(),"customer created",customer));
		
	}
	@GetMapping("/find-customer")
	public ResponseEntity<ResponseStructure<Customer>>findCustomer(int id){
		Customer customer = customerService.finduser(id);
		return ResponseEntity
				.status(HttpStatus.CREATED)
				.body(ResponseStructure.create(HttpStatus.FOUND.value(),"customer found",customer));
	}
	@DeleteMapping("/delete-customer")
	public ResponseEntity<ResponseStructure<Customer>> deleteCustomer(@RequestParam int id) {
		Customer customer= customerService.deleteCustomer(id);
		return ResponseEntity
				.status(HttpStatus.CREATED)
				.body(ResponseStructure.create(HttpStatus.OK.value(),"customer deleted",customer));
	}
	@PutMapping("/update-customer")
	public ResponseEntity<ResponseStructure<Customer>> updateCustomer(@RequestBody Customer customer) {
		customer=customerService.updateCustomer(customer);
		return ResponseEntity
				.status(HttpStatus.CREATED)
				.body(ResponseStructure.create(HttpStatus.OK.value(),"customer updated",customer));
	}
	@GetMapping("/get-all")
	public List<Customer> getAll(){
		return customerService.getAll();
	}

}
