package com.everis.beca.GestionPago.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "weiber")
public class weiberEntity {
	@Id
	@Column(name = "weiber_id ")
	private Integer weiber_id ;
	
	@Column(name = "persona_per_id ")
	private Integer persona_per_id ;
	
	@Column(name = "area_ar_id")
	private Integer area_ar_id;
	
	@Column(name = "weiber_estado")
	private Integer weiber_estado;
}
