package com.myshop.store.dao;

import com.myshop.store.domain.Supplier;
import org.springframework.data.repository.CrudRepository;

public interface SupplierIDao extends CrudRepository<Supplier,Long> {
}
