package fr.bicomat.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.bicomat.dao.DocumentRepository;
import fr.bicomat.entities.Client;
import fr.bicomat.entities.Document;

@Service
@Transactional
public class DocumentServiceImpl implements DocumentService {

	@Autowired
	DocumentRepository documentRepository;
	
	@Override
	public List<Document> retournerContrats(Client client) {
		return documentRepository.findByClient(client);
	}

}
