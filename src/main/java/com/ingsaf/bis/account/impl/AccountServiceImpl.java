package com.ingsaf.bis.account.impl;

import com.ingsaf.bis.account.AccountModel;
import com.ingsaf.bis.account.AccountService;
import com.ingsaf.bis.account.repository.AccountRepository;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Primary
public class AccountServiceImpl implements AccountService {
    private final AccountRepository repository;

    @Override
    public List<AccountModel> findAllAccounts() {
        return repository.findAll();
    }

    @Override
    public AccountModel saveAccount(AccountModel account) {
        return repository.save(account);
    }

    @Override
    public AccountModel findAccountByAccountNumber(String accountNumber) {
        return repository.findByAccountNumber(accountNumber);
    }

    @Override
    public AccountModel updateAccount(AccountModel account) {
        return repository.save(account);
    }

    @Override
    public void deleteAccountByAccountNumber(String accountNumber) {
        repository.deleteByAccountNumber(accountNumber);
    }    
}
