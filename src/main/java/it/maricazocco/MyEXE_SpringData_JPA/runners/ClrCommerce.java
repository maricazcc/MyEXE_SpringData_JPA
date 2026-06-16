package it.maricazocco.MyEXE_SpringData_JPA.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import it.maricazocco.MyEXE_SpringData_JPA.models.Cliente;
import it.maricazocco.MyEXE_SpringData_JPA.models.Ordine;
import it.maricazocco.MyEXE_SpringData_JPA.models.Prodotto;
import it.maricazocco.MyEXE_SpringData_JPA.repository.Cliente_Repository;
import it.maricazocco.MyEXE_SpringData_JPA.repository.Ordine_Repository;
import it.maricazocco.MyEXE_SpringData_JPA.repository.Prodotto_Repository;

@Component
public class ClrCommerce implements CommandLineRunner {
	
	@Autowired
	Ordine_Repository ordineRepo;
	@Autowired
	Cliente_Repository clienteRepo;
	@Autowired
	Prodotto_Repository prodottoRepo;

	@Override
	public void run(String... args) throws Exception {
/* 
		 	// INSERT CLIENTE
		    Cliente c = new Cliente("Sara", "Conte", "4567");
		    clienteRepo.save(c);
		    System.out.println("Cliente inserito: " + c);
		   
		    // INSERT PRODOTTO
		    Prodotto p = new Prodotto("Telefono", "LG", 900);
		    prodottoRepo.save(p);
		    System.out.println("Prodotto inserito: " + p);

		    // INSERT ORDINE		  
		    Ordine o = new Ordine(c, p);
		    ordineRepo.save(o);
		    System.out.println("Ordine inserito: " + o);

		    // UPDATE ORDINE
		    Prodotto nuovoProdotto = new Prodotto("Tablet", "Apple", 950);
		    prodottoRepo.save(nuovoProdotto);

		    int updateOrdini = ordineRepo.myUpdateOrdineById(nuovoProdotto, c, o.getIdOrdine());

		    System.out.println("Ordini aggiornati: " + updateOrdini);
		    
		   
		    // DELETE CLIENTE
		    clienteRepo.deleteById(c.getIdCliente());
		    System.out.println("Cliente eliminato");
		    
		    // DELETE PRODOTTO
		    prodottoRepo.deleteById(p.getIdProdotto());
		    System.out.println("Prodotto eliminato");
		    
		    // DELETE ORDINE
		    ordineRepo.deleteById(o.getIdOrdine());
		    System.out.println("Ordine eliminato");   
		    
		    // SELECT CLIENTI
		    clienteRepo.findAll().forEach(cli -> System.out.println(cli.toString()));
		    
		    // SELECT PRODOTTI
		    prodottoRepo.findAll().forEach(pro -> System.out.println(pro.toString())); */
		    
		    // SELECT ORDINI
		    ordineRepo.findAll().forEach(ord ->   System.out.println("ORDINE " + ord.getIdOrdine() + ":\n" 
		    + ord.getCliente().toString() + "\n" + ord.getProdotto().toString() + "\n"));
		    

	}

}
