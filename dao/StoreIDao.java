package com.myshop.store.dao;

import com.myshop.store.domain.Store;
import org.springframework.data.repository.CrudRepository;

public interface StoreIDao extends CrudRepository<Store,Long> {
}
