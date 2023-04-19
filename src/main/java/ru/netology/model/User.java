package ru.netology.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NonNull;

import java.util.ArrayList;
import java.util.List;

@Data
public class User {
    @Size(min = 2, max = 50)
    @NotBlank
    private String name;
    @Size(min = 5, max = 50)
    @NotBlank
    private String password;
    private List<Authorities> authorities = new ArrayList<>();

    public User(String user, String password) {
        this.name = user;
        this.password = password;
    }

    public void addAuthority(@NonNull Authorities authorities) {
        this.authorities.add(authorities);
    }
}
