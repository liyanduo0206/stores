package com.myshop.store.dao;

import com.myshop.store.domain.Brand;
import org.springframework.data.repository.CrudRepository;

public interface BrandIDao extends CrudRepository<Brand,Long> {
}
