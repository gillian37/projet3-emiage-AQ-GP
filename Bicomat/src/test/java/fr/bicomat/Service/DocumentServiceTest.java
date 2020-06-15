package fr.bicomat.Service;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import fr.bicomat.Service.DocumentService;
import fr.bicomat.entities.Client;
import fr.bicomat.entities.Document;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DocumentServiceTest {
	
	@Autowired
	DocumentService documentService;
	
	@Autowired
	ClientService clientService;
	

	@Test
	public void testRetournerContrats() {
		
		List<Document> listeD = documentService.retournerContrats(clientService.getClientById(12));
		
		assertNotNull(listeD);			
	}
}
