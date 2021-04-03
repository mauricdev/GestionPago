package com.everis.beca.GestionPago.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.everis.beca.GestionPago.dto.AreaJoins;
import com.everis.beca.GestionPago.dto.ResponsePersona;
import com.everis.beca.GestionPago.dto.ResponseWeiber;
import com.everis.beca.GestionPago.dto.WeiberDTO;
import com.everis.beca.GestionPago.dto.personaDTO;
import com.everis.beca.GestionPago.service.areaService;
import com.everis.beca.GestionPago.service.personaService;
import com.everis.beca.GestionPago.service.weiverService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/area")
public class personaController {

	@Autowired
	private personaService personaServices;

	@Autowired
	private weiverService weiverServices;
	
	@Autowired
	private areaService areaServices;
	
	
	@GetMapping("/obtenerPersonas")
	public ResponseEntity<List<personaDTO>> obtenerPersona(@RequestParam Integer per_id) {
		
		List<personaDTO> response = personaServices.obtenerPersona(per_id);
		
		return new ResponseEntity<>( response, HttpStatus.OK);
	}
	
	@GetMapping("/obtenerWeiber")
	public ResponseEntity<List<WeiberDTO>> obtenerWeiber(@RequestParam Integer ar_id) {
		
		List<WeiberDTO> response = weiverServices.obtenerWeiber(ar_id);		
		return new ResponseEntity<>( response, HttpStatus.OK);
	}
	
	
	@GetMapping("/obtenerArea")
	public ResponseEntity<List<AreaJoins>> obtenerArea(@RequestParam Integer area_ar_id) {
		
		List<AreaJoins> response = areaServices.obtenerDatos(area_ar_id);
	
		return new ResponseEntity<>( response, HttpStatus.OK);
	}
	
	
	
	
}
