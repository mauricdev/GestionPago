package com.everis.beca.GestionPago.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class AreaJoins implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String ar_ceco;
	private String ar_nombre_area;
	private String ar_email;
	private Integer area_ar_id;
	private String per_nombre;
	private String per_paterno;
	private String per_materno;
	
}
