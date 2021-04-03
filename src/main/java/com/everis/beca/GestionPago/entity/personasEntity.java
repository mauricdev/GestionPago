package com.everis.beca.GestionPago.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.Data;

@Data
@Entity
@Table(name = "persona")
public class personasEntity {

	@Id
	@Column(name = "per_id")
	private Integer per_id;
	
	@Column(name = "per_rut")
	private String per_rut;
	
	@Column(name = "per_nombre")
	private String per_nombre;
	
	@Column(name = "per_paterno")
	private String per_paterno;
	
	@Column(name = "per_materno")
	private String per_materno;
	
	@Column(name = "per_email")
	private String per_email;
}
