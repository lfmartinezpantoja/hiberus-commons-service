package com.hiberus.commons.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BillDTO implements Serializable {

	private Long billid;
	private double totalAmmount;
	private int totalProducts;
	private String message;

	private static final long serialVersionUID = 2660567969885809728L;
}
