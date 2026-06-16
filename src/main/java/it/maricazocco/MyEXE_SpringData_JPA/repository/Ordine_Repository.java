package it.maricazocco.MyEXE_SpringData_JPA.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import it.maricazocco.MyEXE_SpringData_JPA.models.Cliente;
import it.maricazocco.MyEXE_SpringData_JPA.models.Ordine;
import it.maricazocco.MyEXE_SpringData_JPA.models.Prodotto;
import jakarta.transaction.Transactional;


public interface Ordine_Repository  extends JpaRepository<Ordine, Integer>{


		@Transactional
		@Modifying
		@Query("UPDATE Ordine o SET o.prodotto = :prodotto, o.cliente = :cliente WHERE o.idOrdine = :idOrdine")
		public int myUpdateOrdineById(Prodotto prodotto, Cliente cliente, int idOrdine);
		
	

}
