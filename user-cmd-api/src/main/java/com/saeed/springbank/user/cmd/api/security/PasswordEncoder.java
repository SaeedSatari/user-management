package com.saeed.springbank.user.cmd.api.security;

public interface PasswordEncoder {
    String hashPassword(String password);
}