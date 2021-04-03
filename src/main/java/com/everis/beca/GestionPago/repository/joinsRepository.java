package com.everis.beca.GestionPago.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

import com.everis.beca.GestionPago.entity.areaEntity;
import com.everis.beca.GestionPago.entity.personasEntity;

public interface joinsRepository extends JpaRepository<areaEntity, Integer> {
	
	@Query(value = "select a.ar_ceco, a.ar_nombre_area , a.ar_email , w.area_ar_id, p.per_nombre , p.per_paterno, p.per_materno from area.area a join area.weiber w  on a.ar_id  = w.area_ar_id join area.persona p on w.persona_per_id  = p.per_id where w.area_ar_id =:area_ar_id" , nativeQuery = true)
	public List<areaEntity>obtenerArea(@Param("area_ar_id")Integer area_ar_id);
}
