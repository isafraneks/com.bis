package com.ingsaf.bis.rest;

import com.ingsaf.bis.account.AccountModel;
import com.ingsaf.bis.account.AccountService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/account")
@AllArgsConstructor
public class AccountRestController {

    private final AccountService service;

    @GetMapping
    public List<AccountModel> findAllAccounts() {
        return service.findAllAccounts();
    }

    @PostMapping
    public AccountModel saveAccount(@RequestBody AccountModel Account) {
        return service.saveAccount(Account);
    }

    @GetMapping("/{AccountNumber}")
    public AccountModel findAccountByCode(@PathVariable String AccountNumber) {
        return service.findAccountByAccountNumber(AccountNumber);
    }

    @PutMapping("update")
    public AccountModel updateAccount(@RequestBody AccountModel Account) {
        return service.updateAccount(Account);
    }

    @DeleteMapping("delete/{AccountNumber}")
    public void deleteAccountByAccountNumber(@PathVariable String AccountNumber) {
        service.deleteAccountByAccountNumber(AccountNumber);
    }
    
}
