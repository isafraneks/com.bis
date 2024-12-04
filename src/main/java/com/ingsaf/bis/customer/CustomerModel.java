package com.ingsaf.bis.customer;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import com.ingsaf.bis.account.AccountModel;

@Data
@Entity
@Table(name = "customer")
public class CustomerModel  {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    protected long id;

    @Column(name = "customer_code", unique = true)
    private String customerCode;
    @Column(name = "name")
    private String name;
    @Column(name = "address")
    private String address;
    @Column(name = "phone")
    private String phone;

    @OneToMany(mappedBy = "customer", fetch = FetchType.LAZY)
    List<AccountModel> accounts;
}
