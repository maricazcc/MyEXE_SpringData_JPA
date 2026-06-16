package it.maricazocco.MyEXE_SpringData_JPA.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import it.maricazocco.MyEXE_SpringData_JPA.models.Prodotto;

public interface Prodotto_Repository extends JpaRepository<Prodotto, Integer>{
	
	

}
