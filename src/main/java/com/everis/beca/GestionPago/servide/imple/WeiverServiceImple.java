package com.everis.beca.GestionPago.servide.imple;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.everis.beca.GestionPago.dto.WeiberDTO;
import com.everis.beca.GestionPago.entity.weiberEntity;
import com.everis.beca.GestionPago.repository.weiberRepository;
import com.everis.beca.GestionPago.service.weiverService;
import lombok.extern.slf4j.Slf4j;



@Slf4j
@Service
public class WeiverServiceImple  implements weiverService{
	@Autowired
	private weiberRepository WeiverRepository;
	
	
	@Override
	public List<WeiberDTO> obtenerWeiber(Integer id) {
		List<WeiberDTO> weiverDto = new ArrayList<>();
		
		List<weiberEntity> weiber = WeiverRepository.obtenerWeiber(id);
		
		for (weiberEntity weibers : weiber ) {
			
			WeiberDTO WeiberDTo = new WeiberDTO();

			//WeiberDTo.setWeiber_id(weibers.getWeiber_id());
			WeiberDTo.setWeiber_estado(weibers.getWeiber_estado());
			
			weiverDto.add(WeiberDTo); 
		}

		return weiverDto;
	}
}
