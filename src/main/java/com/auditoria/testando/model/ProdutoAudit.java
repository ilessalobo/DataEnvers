package com.auditoria.testando.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "produtos_audit")

public class ProdutoAudit implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "rev")
	private Long revId;
	
	@Column(name = "revtype")
	private Long revType;
		
	private Long id_produto;
	
	private String produto;
	
	private Double preco;
	
	@OneToOne
	@JoinColumn(name = "rev")
	private RevInfo revInfo;
	
	
}
