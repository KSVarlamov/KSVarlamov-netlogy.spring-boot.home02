package ru.netology.repositories;

import ru.netology.model.Authorities;

import java.util.List;

public interface UserRepository {
    List<Authorities> getUserAuthorities(String user, String password);
}
