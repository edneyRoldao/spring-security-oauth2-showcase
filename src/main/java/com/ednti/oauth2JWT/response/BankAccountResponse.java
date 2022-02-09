package com.ednti.oauth2JWT.response;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
public class BankAccountResponse {

    private int accountId;
    private String accountName;

    public static List<BankAccountResponse> getBankAccountsMock() {
        List<BankAccountResponse> list = new ArrayList<>();
        list.add(BankAccountResponse.builder().accountId(1).accountName("edney").build());
        list.add(BankAccountResponse.builder().accountId(2).accountName("marjorie").build());
        list.add(BankAccountResponse.builder().accountId(3).accountName("nadine").build());
        list.add(BankAccountResponse.builder().accountId(4).accountName("giselle").build());
        return list;
    }

}
