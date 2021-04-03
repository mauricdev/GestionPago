package com.everis.beca.GestionPago.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.everis.beca.GestionPago.entity.weiberEntity;

public interface weiberRepository extends JpaRepository<weiberEntity, Integer> {
	@Query(value = "SELECT * FROM area.weiber WHERE area_ar_id  =:area_ar_id LIMIT 1", nativeQuery = true)
	public List<weiberEntity> obtenerWeiber(@Param("area_ar_id")Integer area_ar_id);
}
