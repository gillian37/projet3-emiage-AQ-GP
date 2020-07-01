package fr.bicomat.Service;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import fr.bicomat.entities.Client;


@RunWith(SpringRunner.class)
@SpringBootTest

public class ClientServiceTest {

	@Autowired
	private ClientService clientService;

	@Test
	public void testCheckClientInteger() {
		
	  Boolean checkOK = clientService.checkClient(9);
	  Boolean checkKO = clientService.checkClient(8);
	  
	  Assert.assertEquals(true, checkOK);
	  Assert.assertEquals(false, checkKO);
	  
	}
	
	@Test
	public void testDocumentsElectroniques() {
		
		Client client = clientService.getClientById(12);
		client.setDocsElectroniques(true);
		
		assertEquals(true, client.getDocsElectroniques());		
		
	}


}
