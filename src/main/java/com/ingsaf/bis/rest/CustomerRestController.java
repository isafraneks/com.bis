package com.ingsaf.bis.rest;

import com.ingsaf.bis.customer.CustomerModel;
import com.ingsaf.bis.customer.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/customer")
@AllArgsConstructor
public class CustomerRestController {

    private final CustomerService service;

    @GetMapping
    public List<CustomerModel> findAllCustomers() {
        return service.findAllCustomers();
    }

    @PostMapping
    public CustomerModel saveCustomer(@RequestBody CustomerModel customer) {
        return service.saveCustomer(customer);
    }

    @GetMapping("/{customerCode}")
    public CustomerModel findCustomerByCode(@PathVariable String customerCode) {
        return service.findCustomerByCode(customerCode);
    }

    @PutMapping("update")
    public CustomerModel updateCustomer(@RequestBody CustomerModel customer) {
        return service.updateCustomer(customer);
    }

    @DeleteMapping("delete/{customerCode}")
    public void deleteCustomerByCode(@PathVariable String customerCode) {
        service.deleteCustomerByCode(customerCode);
    }

}
