package com.everis.beca.GestionPago.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.everis.beca.GestionPago.entity.personasEntity;

public interface personaRepository extends JpaRepository<personasEntity, Integer> {

	@Query(value = "SELECT * FROM area.persona WHERE per_id  =:per_id LIMIT 1", nativeQuery = true)
	public List<personasEntity> obtenerPersonas(@Param("per_id")Integer per_id);
}
