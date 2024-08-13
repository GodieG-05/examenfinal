package com.campuslands.examenfinal.customer.infrastructure.in.web;

import com.campuslands.examenfinal.customer.application.services.CustomerService;
import com.campuslands.examenfinal.customer.domain.entities.Customer;

import java.util.List;
import java.util.Optional;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import jakarta.validation.Valid;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public List<Customer> getAllCustomers() {
        return customerService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable String id) {
        Optional<Customer> foundCustomer = customerService.findById(id);
        if (!foundCustomer.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(foundCustomer.orElseThrow(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Customer> createCustomer(@Valid @RequestBody Customer Customer) {
        customerService.save(Customer);
        return new ResponseEntity<>(Customer, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateCustomer(@PathVariable String id, @Valid @RequestBody Customer customer) {
        Optional<Customer> foundCustomer = customerService.findById(id);
        if (!foundCustomer.isPresent()) {
            return new ResponseEntity<>("Customer no encontrado", HttpStatus.NOT_FOUND);
        }
        customer.setIdCustomer(id);
        customerService.save(customer);
        return new ResponseEntity<>("Customer actualizado correctamente", HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCustomer(@PathVariable String id) {
        Optional<Customer> foundCustomer = customerService.findById(id);
        if (!foundCustomer.isPresent()) {
            return new ResponseEntity<>("Customer no encontrado", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>("Customer eliminado correctamente", HttpStatus.OK);
    }
}
