package com.everis.beca.GestionPago.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.everis.beca.GestionPago.dto.personaDTO;


public interface personaService {
	public List<personaDTO> obtenerPersona(Integer id);
	//public List<personaDTO>ObtenerPersonaId(Integer id);
}
