package fr.bicomat.Service;
import static org.junit.Assert.assertNotNull;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import fr.bicomat.entities.CompteClient;
import fr.bicomat.entities.Operation;


@RunWith(SpringRunner.class)
@SpringBootTest

public class CompteClientServiceTest {

	@Autowired
	private CompteService compteService;

	
	@Test
	public void testListerOperationsRetourneOperations() {
		
		Date dateDebut = new GregorianCalendar(2020, 01, 01).getTime();
		Date dateFin = new GregorianCalendar(2020, 06, 30).getTime();
		CompteClient compte = compteService.getCompteClientById(13);
		
		List<Operation> listeO = compteService.listerOperations(compte, dateDebut, dateFin);
		assertNotNull(listeO);
	}

}
