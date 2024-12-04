package com.ingsaf.bis.customer.impl;

import com.ingsaf.bis.customer.CustomerModel;
import com.ingsaf.bis.customer.CustomerService;
import com.ingsaf.bis.customer.repository.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Primary
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository repository;

    @Override
    public List<CustomerModel> findAllCustomers() {
        return repository.findAll();
    }

    @Override
    public CustomerModel saveCustomer(CustomerModel customer) {
        return repository.save(customer);
    }

    @Override
    public CustomerModel findCustomerByCode(String customerCode) {
        return repository.findByCustomerCode(customerCode);
    }

    @Override
    public CustomerModel updateCustomer(CustomerModel customer) {
        return repository.save(customer);
    }

    @Override
    public void deleteCustomerByCode(String customerCode) {
        repository.deleteByCustomerCode(customerCode);
    }

}
