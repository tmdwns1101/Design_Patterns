package com.lsj.adapter;

import com.lsj.adapter.security.LoginHandler;
import com.lsj.adapter.security.UserDetailsService;

public class App {
    public static void main(String[] args) {

        UserDetailsService userDetailsService = new AccountUserDetailsService(new AccountService());
        LoginHandler loginHandler = new LoginHandler(userDetailsService);
        loginHandler.login("t","t");
    }
}
