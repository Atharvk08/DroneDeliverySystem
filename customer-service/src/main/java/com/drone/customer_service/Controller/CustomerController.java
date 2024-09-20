package com.drone.customer_service.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.drone.customer_service.Model.Customer;
import com.drone.customer_service.Services.CustomerService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/")
	public List<Customer> getAllCustomers() {
		return null;
	}
	
	@GetMapping("/{id}")
	public Optional<Customer> getCustomerById(@PathVariable Long id) {
		return customerService.getCustomerDetails(id);
	}
	
	@PostMapping("/")
	public String createCustomer(@RequestBody Customer customer) {
		//TODO: process POST request
		
		customerService.createCustomer(customer);
		
		return "Success";
	}
	
	@PutMapping("/{id}")
	public String updateCustomer(@RequestBody Customer customer) {		
		customerService.createCustomer(customer);
		
		return "Success";
	}
	
	@DeleteMapping("/{id}")
	public String deleteCustomer(@PathVariable Long id) {		
		customerService.deleteCustomer(id);
		
		return "Success";
	}
	
	
	
	
}
