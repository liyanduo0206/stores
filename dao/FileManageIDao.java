package com.myshop.store.dao;

import com.myshop.store.domain.FileManage;
import org.springframework.data.repository.CrudRepository;

public interface FileManageIDao extends CrudRepository<FileManage,Long> {
}
