package com.imooc.aop.dao;

import com.imooc.aop.domain.OperationLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OperationLogDao extends JpaRepository<OperationLog,Long> {
}
