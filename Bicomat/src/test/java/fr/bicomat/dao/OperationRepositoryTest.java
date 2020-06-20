package fr.bicomat.dao;
import static org.junit.Assert.*;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import fr.bicomat.entities.CompteClient;
import fr.bicomat.entities.Operation;


@RunWith(SpringRunner.class)
@SpringBootTest
public class OperationRepositoryTest {
	
	@Autowired
	CompteClientRepository compteRepository;
	
	@Autowired
	OperationRepository operationRepository;
	
	@Test
	public void testFindByCompteAndDateOperationBetween() {
		
		Date dateDebut = new GregorianCalendar(2020, 01, 01).getTime();
		Date dateFin = new GregorianCalendar(2020, 06, 30).getTime();
		CompteClient compte = compteRepository.getOne(13);
		
		List<Operation> listeO = operationRepository.findByCompteAndDateOperationBetween(compte, dateDebut, dateFin);
		
		assertNotNull(listeO);
	}
	
	

}
