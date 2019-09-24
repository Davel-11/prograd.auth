package com.nebulosa.auth.dao;

import com.nebulosa.auth.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

}
