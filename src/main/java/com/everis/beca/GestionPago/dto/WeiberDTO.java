package com.everis.beca.GestionPago.dto;

import java.io.Serializable;

import lombok.Data;
@Data
public class WeiberDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer weiber_id;
	private Integer per_id;
	private Integer ar_id;
	private Integer weiber_estado;
}
