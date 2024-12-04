package com.ingsaf.bis.account.repository;

import com.ingsaf.bis.account.AccountModel;
import com.ingsaf.bis.customer.CustomerModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<AccountModel, Long> {
    void deleteByAccountNumber(String accountNumber);
    AccountModel findByAccountNumber(String accountNumber);

}
