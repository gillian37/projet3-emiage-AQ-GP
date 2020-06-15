package fr.bicomat.Service;

import java.util.List;

import fr.bicomat.entities.Client;
import fr.bicomat.entities.Document;

/**
 * Interface de la gestion des documents (contrats...)
 * @author gillian.petit
 *
 */
public interface DocumentService {
	
	/**
	 * Retourne la liste des documents liés au client
	 * @param client
	 * @return liste de documents
	 */
	List<Document> retournerContrats(Client client);

}
