package com.drone.customer_service.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.drone.customer_service.Model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
