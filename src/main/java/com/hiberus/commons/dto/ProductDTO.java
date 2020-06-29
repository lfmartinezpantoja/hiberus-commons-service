package com.hiberus.commons.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProductDTO implements Serializable {

	private Long id;
	private int quantity;
	private double cost;
	private static final long serialVersionUID = 2660567969885809728L;
}
