package com.example.demo.controller;

import com.example.demo.entity.Account;
import com.example.demo.enums.Gender;
import com.example.demo.enums.Status;
import com.example.demo.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {

    private final AccountService accountService;
    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }
    @PostMapping("/addAccount")
    public ResponseEntity<Account> addAccount(@RequestBody Account account){
        return new ResponseEntity<>(accountService.addAccount(account), HttpStatus.CREATED);
    }
    @GetMapping("/")
    public ResponseEntity<List<Account>> getAllAccount(){
        return new ResponseEntity<>(accountService.getAllAccount(),HttpStatus.OK);
    }
    @GetMapping("/gender")
    public ResponseEntity<List<Gender>> getEnumContentByGender(){
        return new ResponseEntity<>(accountService.getEnumContentByGender(),HttpStatus.OK);
    }
    @GetMapping("/account")
    public ResponseEntity<List<Account>> getAccountByStatusId(@RequestBody List<Integer> statusId){
        return new ResponseEntity<>(accountService.getAccountByStatusId(statusId),HttpStatus.OK);
    }
}
