package com.everis.beca.GestionPago.servide.imple;

import java.util.ArrayList;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.everis.beca.GestionPago.dto.personaDTO;
import com.everis.beca.GestionPago.entity.personasEntity;
import com.everis.beca.GestionPago.repository.personaRepository;
import com.everis.beca.GestionPago.service.personaService;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@Service
public class personaServiceImple implements personaService  {
	
	@Autowired
	private personaRepository personaRepositorio;
	

	@Override
	public List<personaDTO> obtenerPersona(Integer id) {
		
		List<personaDTO> personaDto = new ArrayList<>();

		List<personasEntity> perso = personaRepositorio.obtenerPersonas(id);

		for (personasEntity persona : perso) {
			personaDTO personasDto = new personaDTO();

			personasDto.setPer_id(persona.getPer_id());
			personasDto.setPer_rut(persona.getPer_rut());
			personasDto.setPer_nombre(persona.getPer_nombre());
			personasDto.setPer_paterno(persona.getPer_paterno());
			personasDto.setPer_materno(persona.getPer_materno());
			personasDto.setPer_email(persona.getPer_email());
			personaDto.add(personasDto); 
		}

		return personaDto;
	}

}
