package com.lsj.adapter;

public class AccountService {

    public Account findAccountByUsername(String username) {
        Account account = new Account();

        account.setName(username);
        account.setEmail(username);
        account.setPassword(username);

        return account;
    }

    public void createNewAccount() {

    }

    public void updateAccount() {}
}
