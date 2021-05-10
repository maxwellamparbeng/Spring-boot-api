package com.userapi.userapi.repo;

import com.userapi.userapi.model.User;
import org.springframework.data.repository.CrudRepository;

public interface userRepo extends CrudRepository<User, Integer> {
}
