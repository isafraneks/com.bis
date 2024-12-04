package com.ingsaf.bis.customer.repository;

import com.ingsaf.bis.customer.CustomerModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<CustomerModel, Long> {

    void deleteByCustomerCode(String customerCode);
    CustomerModel findByCustomerCode(String customerCode);

}
