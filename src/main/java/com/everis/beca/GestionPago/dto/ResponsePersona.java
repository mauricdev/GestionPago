package com.everis.beca.GestionPago.dto;

import lombok.Data;

@Data
public class ResponsePersona {
	private static final long serialVersionUID = 1L;
	
	private Integer per_id;
	private String per_rut;
	private String per_nombre;
	private String per_paterno;
	private String per_materno;
	private String per_email;
}
