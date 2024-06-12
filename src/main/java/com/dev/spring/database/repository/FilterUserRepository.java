package com.dev.spring.database.repository;

import com.dev.spring.database.entity.User;
import com.dev.spring.dto.UserFilter;

import java.util.List;

public interface FilterUserRepository {

    List<User> findAllByFilter(UserFilter userFilter);
}
