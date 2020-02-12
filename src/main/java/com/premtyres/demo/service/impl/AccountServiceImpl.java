package com.premtyres.demo.service.impl;

import com.premtyres.demo.model.Account;
import com.premtyres.demo.repository.AccountRepository;
import com.premtyres.demo.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository repo;

    @Override
    public List<Account> getAccounts() {
        return repo.findAll();
    }

    @Override
    public String saveAccount(Account account) {
        try{
            repo.save(account);
            return "Successfully saved";
        }catch(Exception e){
            return e.getMessage();
        }
    }
}
