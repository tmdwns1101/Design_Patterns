package com.lsj.adapter.security;

public interface UserDetailsService {

    UserDetails loadUser(String username);
}
