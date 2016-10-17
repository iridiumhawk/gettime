package com.cherkasov.repository;

import com.cherkasov.entity.User;

import java.util.List;

public interface UserRepository {
    User create();

    User get();

    List<User> getAll();

    User getBy();

    boolean update();

    boolean delede();


}
