package com.hiberus.commons.service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.hiberus.commons.dto.ClientDTO;

public interface ClientFeingClient {

	@GetMapping("clients/{clientId}")
	public ResponseEntity<ClientDTO> getClient(@PathVariable Long clientId);

}
