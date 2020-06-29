package com.hiberus.commons.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LogisticDTO implements Serializable {

	private Long id;
	private Long billId;
	private double totalAmount;
	private int totalProducts;
	private int clientIdentification;
	private String clientName;
	private String address;

	private static final long serialVersionUID = 2660567969885809728L;
}
