package com.auditoria.testando.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.auditoria.testando.model.Produto;
import com.auditoria.testando.service.ProdutoService;

@RestController
@RequestMapping("/produto")
public class ProdutoResource {

	@Autowired
	private ProdutoService produtoService;

	@PostMapping("/create")
	public Produto create(@RequestBody Produto produto) {
		return produtoService.create(produto);
	}

	@GetMapping("/all")
	public List<Produto> listarProdutos() {
		return produtoService.listarProdutos();
	}

	@DeleteMapping("/{idProduto}")
	public void delete(@PathVariable Long idProduto) {
		produtoService.delete(idProduto);

	}

	@PutMapping("/atualizar/{idProduto}")
	public Produto atualizarProduto(@PathVariable Long idProduto, @RequestBody Produto produto) {
		return produtoService.atualizar(idProduto, produto);
	}

}
