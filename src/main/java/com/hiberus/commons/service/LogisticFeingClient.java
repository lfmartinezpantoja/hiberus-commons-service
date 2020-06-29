package com.hiberus.commons.service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.hiberus.commons.dto.LogisticDTO;
import com.hiberus.commons.dto.OrderResponseDTO;

public interface LogisticFeingClient {

	@PostMapping("logistic")
	public ResponseEntity<OrderResponseDTO> logistic(@RequestBody LogisticDTO logisticDTO);

}
