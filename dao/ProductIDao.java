package com.myshop.store.dao;

import com.myshop.store.domain.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductIDao extends CrudRepository<Product,Long> {
}
