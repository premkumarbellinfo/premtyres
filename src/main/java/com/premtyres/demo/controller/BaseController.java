package com.premtyres.demo.controller;

import com.premtyres.demo.model.Account;
import com.premtyres.demo.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Component
public class BaseController {

    @RequestMapping("/hello")
    public String index(){
        return "Hello world";
    }

    @Autowired
    private AccountService accountService;

    @GetMapping(value = "/getAccounts")
    public List<Account> getAccountDetail(){

        return accountService.getAccounts();
    }

    @PostMapping(value = "/saveAccount")
    public String saveAccount(@RequestBody Account account){
        return accountService.saveAccount(account);
    }

}
