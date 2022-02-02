package com.lsj.adapter;

import com.lsj.adapter.security.UserDetails;


//UserDetails Adapter
public class AccountUserDetails implements UserDetails {

    Account account;

    public AccountUserDetails(Account account) {
        this.account = account;
    }

    @Override
    public String getUsername() {
        return account.getName();
    }

    @Override
    public String getPassword() {
        return account.getPassword();
    }
}
