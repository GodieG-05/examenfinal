package com.campuslands.examenfinal.customer.infrastructure.out;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.campuslands.examenfinal.customer.domain.entities.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, String> {

}
