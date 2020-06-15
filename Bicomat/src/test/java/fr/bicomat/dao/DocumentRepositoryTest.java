package fr.bicomat.dao;

import static org.junit.Assert.assertNotNull;

import java.util.List;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import fr.bicomat.entities.Document;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DocumentRepositoryTest {

	@Autowired
	ClientRepository clientRepository;
	
	@Autowired
	DocumentRepository documentRepository;
	
	@Test
	public void testFindByClient() {
		
		List<Document> listeD = documentRepository.findByClient(clientRepository.getOne(12));
		
		assertNotNull(listeD);
	}
}
