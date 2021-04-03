package com.everis.beca.GestionPago.servide.imple;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.beca.GestionPago.dto.AreaJoins;
import com.everis.beca.GestionPago.dto.WeiberDTO;
import com.everis.beca.GestionPago.entity.areaEntity;
import com.everis.beca.GestionPago.entity.weiberEntity;
import com.everis.beca.GestionPago.repository.joinsRepository;
import com.everis.beca.GestionPago.service.areaService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class AreaServiceImple extends areaService {

	@Autowired
	private joinsRepository joinsREpository;
	
	public List<AreaJoins> obtenerDatos(Integer id) {
		
		List<AreaJoins> joins = new ArrayList<>();
		
		List<areaEntity> Data = joinsREpository.obtenerArea(id);
		
		for (areaEntity join : Data ) {
			
			AreaJoins area = new AreaJoins();
			
			area.setAr_ceco(join.getAr_ceco());
			area.setAr_nombre_area(join.getAr_nombre_area());
			area.setAr_email(join.getAr_email());
			area.setArea_ar_id(join.getArea_ar_id());
			area.setPer_nombre(join.getPer_nombre());
			area.setPer_paterno(join.getPer_paterno());
			area.setPer_materno(join.getPer_materno());
			
			joins.add(area); 
		}
		
		
		
		return  joins;
		 
	}
}
