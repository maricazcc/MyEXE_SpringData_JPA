package it.maricazocco.MyEXE_SpringData_JPA.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import it.maricazocco.MyEXE_SpringData_JPA.models.Cliente;


public interface Cliente_Repository extends JpaRepository<Cliente, Integer>{
	


}
