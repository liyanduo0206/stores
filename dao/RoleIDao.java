package com.myshop.store.dao;

import com.myshop.store.domain.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleIDao extends CrudRepository<Role,Long> {
}
