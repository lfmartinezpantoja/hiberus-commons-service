package com.hiberus.commons.error;

public enum Errors {

	NOT_FOUND_EXCEPTION(1, "El recurso no fue encontrado", "El recurso : %s no pudo ser encontrado"),
	INVALID_PARAMETER(2, "Parametro invalido", "Alguno de los parametros enviados no cumple con los requisitos"),
	DEFAULT_EXCEPTION(3, "Ha ocurrido un error", "Intentelo mas tarde o comuniquese con su administrador"),
	PARAMETER_REQUIRED_NOT_FOUND(4, "Parametro requerido no suministrado",
			"Alguno de los parametros requeridos no ha sido suministrado en la peticion"),
	INVALID_JSON(5, "Json invalido", "El json contiene parametros invalidos"),
	CLIENT_NOT_FOUND(6, "Cliente no encontrado", "Cliente con %s no esta registrado en la base de datos"),
	CLIENT_WITH_IDENTIFICATION_NUMBER_ALREADY_EXIST(7, "Cliente ya existe",
			"Cliente con %s ya existe en la base de datos"),
	EMAIL_OR_USERNAME_ARE_ALREADY_REGISTERED_FOR_OTHER_CLIENT(8, "Cliente ya existe",
			"Ya existe un cliente con ese username o email"),
	FEIGN_EXCEPTION(9, "Error al consumir un servicio", "Ocurrio un error al consumir un servicio externo"),
	NO_PRODUCTS_TO_BUY(10, "List of products is empty", "List products need at least one product"),
	IDENTIFICATION_NUMBER_IS_REQUIRED(11, "Identification number is mandatory",
			"Identification number is mandatory to regist client"),
	CLIENT_DOESNT_EXIST(11, "client not found", "Client with this identification not found");
	public final int code;
	public final String title;
	public final String description;

	Errors(int code, String title, String description) {
		this.code = code;
		this.title = title;
		this.description = description;
	}

}
