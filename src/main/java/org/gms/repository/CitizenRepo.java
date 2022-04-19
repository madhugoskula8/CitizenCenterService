package org.gms.repository;

import java.util.List;

import org.gms.entity.Citizen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CitizenRepo extends JpaRepository<Citizen, Integer>{
	public List<Citizen> findByVaccinationCenterId(Integer id);

}
