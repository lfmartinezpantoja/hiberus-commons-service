package com.hiberus.commons.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ClientResponseDTO implements Serializable {

	private String message;
	private Long clientId;
	private static final long serialVersionUID = 1L;
}
