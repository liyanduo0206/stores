package com.myshop.store.dao;

import com.myshop.store.domain.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressIDao extends JpaRepository<Address,Integer> {
}
