package com.myshop.store.dao;

import com.myshop.store.domain.SalePromotion;
import org.springframework.data.repository.CrudRepository;

public interface SalePromotionIDao extends CrudRepository<SalePromotion,Long> {
}
