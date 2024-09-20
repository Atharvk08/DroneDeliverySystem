package com.drone.customer_service.Services;

import java.net.http.HttpResponse;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.resource.HttpResource;

import com.drone.customer_service.Model.Customer;
import com.drone.customer_service.Repository.CustomerRepository;

import jakarta.ws.rs.NotFoundException;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository repository;
	
	public List<Customer> getAllCustomer(){
		return repository.findAll();
	}
	
	public Optional<Customer> getCustomerDetails(Long id) {
		Optional<Customer> customer = repository.findById(id);
		
		if(customer == null) {
			throw new NotFoundException();
		}
		
		return customer;
	}
	
	public String createCustomer(Customer customer)
	{
		repository.save(customer);
		return "Success";
	}
	
	public String updateCustomer(Customer customer)
	{
		repository.save(customer);
		return "Success";
	}
	public String deleteCustomer(Long id)
	{
		Optional<Customer> customer = repository.findById(id);
		if(customer == null) {
			throw new NotFoundException();
		}
		
		repository.deleteById(id);
		
		return "Success";
	}
	
	
}
