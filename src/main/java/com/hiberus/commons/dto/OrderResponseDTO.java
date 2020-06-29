package com.hiberus.commons.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

import com.fasterxml.jackson.annotation.JsonInclude;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderResponseDTO implements Serializable {

	@ApiModelProperty(notes = "Bill number of purchase")
	private Long billId;
	@ApiModelProperty(notes = "Date of regist purchase")
	private LocalDate date;
	@ApiModelProperty(notes = "Time of regist purchase")
	private LocalTime time;
	@ApiModelProperty(notes = "Total amount of bill")
	private String totalAmount;
	@ApiModelProperty(notes = "Total prodcuts")
	private int totalProducts;
	@ApiModelProperty(notes = "Client name, firstname and lastname")
	private String clientName;
	@ApiModelProperty(notes = "Direction to send purchase")
	private String address;
	@ApiModelProperty(notes = "Message with sumary of order")
	private String description;
	private static final long serialVersionUID = 5221826477702104453L;
}
