package com.tap.customerApi.Repository;

import com.tap.customerApi.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository  extends JpaRepository<Customer, Integer> {
}
