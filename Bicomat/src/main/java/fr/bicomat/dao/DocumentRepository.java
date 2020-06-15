package fr.bicomat.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.bicomat.entities.Client;
import fr.bicomat.entities.Document;


@Repository
public interface DocumentRepository extends JpaRepository<Document, Integer> {
	
	/**
   * Obtient la liste des documents à partir de l'id du client.
   * @param idCLient.
   * @return liste des documents du client
   */
	public List<Document> findByClient(Client client);

}