package com.lsj.adapter;

import com.lsj.adapter.security.UserDetails;
import com.lsj.adapter.security.UserDetailsService;

//UserDetailsService Adapter
public class AccountUserDetailsService implements UserDetailsService {

    AccountService accountService;

    public AccountUserDetailsService(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public UserDetails loadUser(String username) {
        Account account = accountService.findAccountByUsername(username);
        return new AccountUserDetails(account);
    }
}
