package com.premtyres.demo.service;

import com.premtyres.demo.model.Account;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AccountService {

    public List<Account> getAccounts();
    public String saveAccount(Account account);
}
