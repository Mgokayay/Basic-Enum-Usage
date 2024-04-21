package com.example.demo.repository;

import com.example.demo.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AccountRepository extends JpaRepository<Account,Long> {

    @Query(value = "SELECT * FROM t_account WHERE STATUS IN (?)",nativeQuery = true)
    List<Account> getAccountByStatusId(List<Integer> statusId);
}
