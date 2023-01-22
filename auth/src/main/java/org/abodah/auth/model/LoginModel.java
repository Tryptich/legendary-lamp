package org.abodah.auth.model;

import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;
@Validated
public class LoginModel {
    @NotBlank(message = "Name is mandatory")
    private String login;
    @NotBlank(message = "Password is mandatory")
    private String password;

    public LoginModel() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "LoginModel{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
