package com.hiberus.commons.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "logistic")
public class Logistic implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long logisticId;
//	@OneToOne(mappedBy = "bills")
//	private Bill bill;
	private String description;
	private static final long serialVersionUID = 2784757528833800103L;

}
