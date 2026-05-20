package com.bank.customer.service;

import com.bank.customer.entity.Customer;
import com.bank.customer.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public Customer getCustomerById(Long id) {
        return customerRepository.findById(id)
                .orElse(null);
    }

    public Customer updateCustomer(Long id, Customer customerDetails) {
        Customer existingCustomer = customerRepository.findById(id)
                .orElse(null);

        if (existingCustomer == null) {
            return null;
        }

        existingCustomer.setFirstName(customerDetails.getFirstName());
        existingCustomer.setLastName(customerDetails.getLastName());
        existingCustomer.setEmail(customerDetails.getEmail());
        existingCustomer.setPhoneNumber(customerDetails.getPhoneNumber());

        return customerRepository.save(existingCustomer);
    }

    public String deleteCustomer(Long id) {
        if (!customerRepository.existsById(id)) {
            return "Customer not found";
        }

        customerRepository.deleteById(id);
        return "Customer deleted successfully";
    }
}
