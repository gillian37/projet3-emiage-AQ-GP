package fr.bicomat.dao;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.bicomat.entities.CompteTiers;
import fr.bicomat.entities.Conseiller;

@Repository
public interface CompteTiersRepository extends JpaRepository<CompteTiers, Integer> {
  /**
   * Obtient la liste des comptes tiers à partir de l'id du client.
   * @param idCLient id du client
   * @return liste des comptes tiers.
   */
   List<CompteTiers> findByClientIdclient(Integer clientIdclient);
}
