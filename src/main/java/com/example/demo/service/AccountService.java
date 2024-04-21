package com.example.demo.service;

import com.example.demo.entity.Account;
import com.example.demo.enums.Gender;
import com.example.demo.repository.AccountRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    private final AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public Account addAccount(Account account){
        return accountRepository.save(account);
    }

    public List<Account> getAllAccount(){
        return accountRepository.findAll();
    }

    public List<Gender> getEnumContentByGender(){
        return List.of(Gender.values());
    }

    public List<Account>  getAccountByStatusId(List<Integer> statusId){
         return accountRepository.getAccountByStatusId(statusId);
    }


}
