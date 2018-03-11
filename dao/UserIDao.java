package com.myshop.store.dao;

import com.myshop.store.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserIDao extends CrudRepository<User,Long> {
}
