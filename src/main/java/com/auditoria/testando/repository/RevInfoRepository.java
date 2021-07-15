package com.auditoria.testando.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.auditoria.testando.model.RevInfo;

@Repository
public interface RevInfoRepository extends JpaRepository<RevInfo, Long>{

}
