package com.everis.beca.GestionPago.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class areaEntity implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8478204769135006566L;
	
	@Id
	@Column(name = "area_ar_id")
	private Integer area_ar_id;
	
	@Column(name = "ar_ceco")
	private String ar_ceco;
	
	@Column(name = "ar_nombre_area")
	private String ar_nombre_area;
	
	@Column(name = "ar_email")
	private String ar_email;
	
	@Column(name = "per_nombre")
	private String per_nombre;
	
	@Column(name = "per_paterno")
	private String per_paterno;
	
	@Column(name = "per_materno")
	private String per_materno;
}
