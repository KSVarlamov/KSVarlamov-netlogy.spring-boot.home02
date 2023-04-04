package ru.netology.model;

import lombok.Data;
import lombok.NonNull;

import java.util.ArrayList;
import java.util.List;

@Data
public class User {
    private String name;
    private String password;
    private List<Authorities> authorities = new ArrayList<>();

    public User(@NonNull String name, @NonNull String password) {
        this.name = name;
        this.password = password;
    }

    public void addAuthority(@NonNull Authorities authorities) {
        this.authorities.add(authorities);
    }
}
