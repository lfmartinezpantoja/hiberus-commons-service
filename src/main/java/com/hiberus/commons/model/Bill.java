package com.hiberus.commons.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "bills")
public class Bill implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long billId;
	private double totalAmount;
	private int totalProducts;
	@ManyToOne(optional = false)
	private Client client;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Product> products;
	private static final long serialVersionUID = 2784757528833800103L;

}
