package com.myshop.store.dao;

import com.myshop.store.domain.Persion;
import org.springframework.data.repository.CrudRepository;

public interface PersionIDao extends CrudRepository<Persion,Long> {
}
