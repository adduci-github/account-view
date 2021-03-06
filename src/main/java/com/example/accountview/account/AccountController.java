package com.example.accountview.account;

import com.example.accountview.account.model.Account;
import com.example.accountview.account.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AccountController {
    @Autowired
    private AccountRepository accountRepository;

    @GetMapping("/accounts")
    public List<Account> selectAccount(Account account){
        return accountRepository.findAll();
    }
}