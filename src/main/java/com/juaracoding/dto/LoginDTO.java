package com.juaracoding.dto;

import javax.validation.constraints.*;

public class LoginDTO {

    @NotNull(message = "NULL!!!")
    @NotBlank(message = "BLANK!!!")
    @NotEmpty(message = "EMPTY!!!")
    @Pattern(regexp = "^[\\w]{8,16}$",message = "Username dan password salah")
    private String username;

    @NotNull
    @NotBlank
    @NotEmpty
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
