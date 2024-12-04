package com.ingsaf.bis.account;

import com.ingsaf.bis.account.AccountModel;

import java.util.List;

public interface AccountService {
    List<AccountModel> findAllAccounts();
    AccountModel saveAccount(AccountModel account);
    AccountModel findAccountByAccountNumber(String accountNumber);
    AccountModel updateAccount(AccountModel account);
    void deleteAccountByAccountNumber(String accountNumber);
}
