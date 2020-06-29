package com.hiberus.commons.service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.hiberus.commons.dto.BillDTO;
import com.hiberus.commons.dto.OrderDTO;

public interface BillFeingClient {

	@PostMapping("bill")
	public ResponseEntity<BillDTO> generateBill(@RequestBody OrderDTO orderDTO);

}
