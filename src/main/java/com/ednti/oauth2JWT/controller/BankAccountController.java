package com.ednti.oauth2JWT.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ednti.oauth2JWT.response.BankAccountResponse;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/bank-account")
public class BankAccountController {

    @GetMapping("{id}")
    public ResponseEntity<BankAccountResponse> getBankAccount(@PathVariable int id) {
        BankAccountResponse response = BankAccountResponse
                .getBankAccountsMock()
                .stream()
                .filter(ba -> ba.getAccountId() == id)
                .findFirst()
                .get();

        return ResponseEntity.ok(response);
    }

    @GetMapping("names")
    public ResponseEntity<List<String>> listAccountNames() {
        List<String> names = BankAccountResponse.getBankAccountsMock()
                .stream()
                .map(BankAccountResponse::getAccountName)
                .collect(Collectors.toList());

        return ResponseEntity.ok(names);
    }

}
