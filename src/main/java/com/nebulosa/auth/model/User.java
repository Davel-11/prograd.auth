package com.nebulosa.auth.model;

import java.io.Serializable;

public class User implements Serializable {

    private static final long serialVersionUID = 5926468583005150707L;

    private String username;
    private String password;
    private String rol;
    private JwtResponse tokenData;

    //need default constructor for JSON Parsing
    public User()
    {

    }

    public JwtResponse getTokenData() {
        return tokenData;
    }

    public void setTokenData(JwtResponse tokenData) {
        this.tokenData = tokenData;
    }

    public User(String username, String password, String rol, JwtResponse tokenData) {
        this.username = username;
        this.password = password;
        this.rol = rol;
        this.tokenData = tokenData;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public User(String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}