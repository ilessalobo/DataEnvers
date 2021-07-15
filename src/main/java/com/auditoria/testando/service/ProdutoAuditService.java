package com.auditoria.testando.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.auditoria.testando.model.ProdutoAudit;
import com.auditoria.testando.repository.ProdutoAuditRepository;

@Service
public class ProdutoAuditService {
	
	@Autowired
	private ProdutoAuditRepository produtoAuditRepository;
	
	public List<ProdutoAudit> listarAuditorias() {
		return produtoAuditRepository.findAll();
	}

	public void removerAuditoria(Long revId) {
		produtoAuditRepository.deleteById(revId);
	}
}
