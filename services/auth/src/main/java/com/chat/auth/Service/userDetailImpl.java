package com.chat.auth.Service;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.net.http.HttpResponse;
import java.util.Collection;
import java.util.List;

@Service
public class userDetailImpl implements UserDetails {

    public HttpResponse<String> register(){

    }

    public HttpResponse<String> login(){

    }


    public boolean validate(String email, String password){

    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of();
    }

    @Override
    public String getPassword() {
        return "";
    }

    @Override
    public String getUsername() {
        return "";
    }
}
