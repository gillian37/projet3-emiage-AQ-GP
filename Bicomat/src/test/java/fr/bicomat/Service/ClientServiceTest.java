package fr.bicomat.Service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


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


}
