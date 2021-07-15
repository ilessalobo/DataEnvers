package com.auditoria.testando.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.auditoria.testando.model.RevInfo;
import com.auditoria.testando.service.RevInfoService;

@RestController
@RequestMapping("/revinfo")
public class RevInfoResource {

	@Autowired
	private RevInfoService revInfoService;
	
	@GetMapping("/all")
	public List<RevInfo> listarTodasInfo() {
		return revInfoService.listarTodasInfo();
	}
}
