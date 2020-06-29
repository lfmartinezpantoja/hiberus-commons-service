package com.hiberus.commons.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonInclude;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderDTO implements Serializable {

	@NotNull
	@ApiModelProperty(notes = "Unique number for identificate client, numerical and positive")
	private Long clientId;
	@NotNull
	@ApiModelProperty(notes = "Date of emition of order.")
	private LocalDate date;
	@NotNull
	@ApiModelProperty(notes = "Direction to send order")
	private String direction;
	@NotNull
	@ApiModelProperty(notes = "List products to buy")
	private List<ProductDTO> products;
	private static final long serialVersionUID = 5221826477702104453L;
}
