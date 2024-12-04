package com.ingsaf.bis.customer;

import org.springframework.stereotype.Service;
import java.util.List;

public interface CustomerService {

    List<CustomerModel> findAllCustomers();
    CustomerModel saveCustomer(CustomerModel customer);
    CustomerModel findCustomerByCode(String customerCode);
    CustomerModel updateCustomer(CustomerModel customer);
    void deleteCustomerByCode(String customerCode);
}
