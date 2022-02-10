package com.edn.oauth2jwt.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/bank-account")
public class BankAccountController {

    @GetMapping("{id}")
    public ResponseEntity<BankAccount> getBankAccount(@PathVariable int id) {
        BankAccount response = BankAccount
                .getAccountsMock()
                .stream()
                .filter(ba -> ba.getId() == id)
                .findFirst()
                .get();

        return ResponseEntity.ok(response);
    }

    @GetMapping("names")
    public ResponseEntity<List<String>> listAccountNames() {
        List<String> names = BankAccount.getAccountsMock()
                .stream()
                .map(BankAccount::getName)
                .collect(Collectors.toList());

        return ResponseEntity.ok(names);
    }

}
