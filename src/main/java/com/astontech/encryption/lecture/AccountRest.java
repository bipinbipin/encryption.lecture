package com.astontech.encryption.lecture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountRest {

    @Autowired
    AccountRepository accountRepository;

    @GetMapping("/greeting/{name}")
    public String greeting(@PathVariable String name) {
        return "hello " + name + "!!";
    }

    @GetMapping("/account/{accountNumber}")
    public ResponseEntity<Account> getAccount(@PathVariable Integer accountNumber) {
        return ResponseEntity.ok(accountRepository.findById(accountNumber).get());
    }

}
