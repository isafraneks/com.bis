package com.ingsaf.bis.account;

import jakarta.persistence.*;
import lombok.Data;
import com.ingsaf.bis.customer.CustomerModel;

import java.util.List;

@Data
@Entity
@Table(name = "account")
public class AccountModel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    protected long id;

    @Column(name = "account_number")
    private String accountNumber;
    @Column(name = "iban")
    private String iban;
    @Column(name = "status")
    private String status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id", nullable = false)
    CustomerModel customer;
}