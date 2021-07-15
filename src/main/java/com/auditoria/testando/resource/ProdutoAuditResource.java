package com.auditoria.testando.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.auditoria.testando.model.ProdutoAudit;
import com.auditoria.testando.service.ProdutoAuditService;

@RestController
@RequestMapping("/auditoria")
public class ProdutoAuditResource {

	@Autowired
	private ProdutoAuditService produtoAuditService;
	
	@GetMapping("/all")
	public List<ProdutoAudit> listarAuditorias() {
		return produtoAuditService.listarAuditorias();
	}
	
	@DeleteMapping("/{revId}")
	public void removerAuditoria(Long revId ) {
		produtoAuditService.removerAuditoria(revId);
	}
}
