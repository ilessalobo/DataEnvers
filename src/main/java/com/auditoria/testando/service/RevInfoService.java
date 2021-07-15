package com.auditoria.testando.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.auditoria.testando.model.RevInfo;
import com.auditoria.testando.repository.RevInfoRepository;

@Service
public class RevInfoService {

	@Autowired
	private RevInfoRepository revInfoRepository;

	public List<RevInfo> listarTodasInfo() {
		return revInfoRepository.findAll();
	}
}
