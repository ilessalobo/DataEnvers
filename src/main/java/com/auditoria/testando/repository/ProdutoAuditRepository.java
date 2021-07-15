package com.auditoria.testando.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.auditoria.testando.model.ProdutoAudit;


@Repository
public interface ProdutoAuditRepository extends JpaRepository<ProdutoAudit, Long>{
		
	@Query("select pa from ProdutoAudit pa")
	public List<ProdutoAudit> listarAuditorias(@Param("idProduto") Long idProduto);

}
