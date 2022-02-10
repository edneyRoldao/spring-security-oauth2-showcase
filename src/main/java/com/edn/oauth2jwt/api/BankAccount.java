package com.edn.oauth2jwt.api;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
public class BankAccount {

    private int id;
    private String name;
    private double balance;

    public static List<BankAccount> getAccountsMock() {
        List<BankAccount> list = new ArrayList<>();
        list.add(BankAccount.builder().id(1).name("edney").balance(453.45).build());
        list.add(BankAccount.builder().id(2).name("marjorie").balance(453.45).build());
        list.add(BankAccount.builder().id(3).name("nadine").balance(453.45).build());
        list.add(BankAccount.builder().id(4).name("giselle").balance(453.45).build());
        return list;
    }

}
