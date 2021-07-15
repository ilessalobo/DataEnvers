package com.auditoria.testando.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.auditoria.testando.model.Produto;
import com.auditoria.testando.repository.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;

	public Produto create(Produto produto) {
		return produtoRepository.save(produto);
	}

	public List<Produto> listarProdutos() {
		return produtoRepository.findAll();
	}

	public void delete(Long idProduto) {
		produtoRepository.deleteById(idProduto);
	}

	public Produto atualizar(Long idProduto, Produto produto) {
		Produto produtoSave = produtoRepository.findById(idProduto).get();
		BeanUtils.copyProperties(produto, produtoSave, "idProduto");
		return produtoRepository.save(produtoSave);
	}

}
