package fr.bicomat.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.bicomat.entities.CompteClient;
import fr.bicomat.entities.Operation;
@Repository
public interface OperationRepository extends JpaRepository<Operation, Long> {
	
	public List<Operation> findByCompteAndDateOperationBetween(CompteClient compte, Date dateDebut, Date dateFin);

}
