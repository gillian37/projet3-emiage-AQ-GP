package fr.bicomat.Service;


import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import fr.bicomat.entities.CompteTiers;
import fr.bicomat.Service.CompteService;
import fr.bicomat.dao.CompteTiersRepository;


@RunWith(SpringRunner.class)
@SpringBootTest


public class CompteServiceBeneficiaireTest {

  @Autowired
  private CompteService compteService;
  @Autowired
  private CompteTiersRepository compteTiersRepository;

  
  @Test
  public void testGetCompteTiersByClient() {

    // Récupération de tous les comptes tiers afin de contrôler la distinction
    // des comptes tiers et client.
    // Utilisation du Repository
    List<CompteTiers> allCompteTiers = compteTiersRepository.findAll();
    
    int cpttiers = 0;
    for (CompteTiers u : allCompteTiers) {
      cpttiers++;
    }
    Assert.assertEquals(3, cpttiers);
    
    // Vérification de la bonne récupération des comptes tiers via le service
    List<CompteTiers> compteTiers = compteService.getCompteTierByClient(9);

    Assert.assertEquals("00011199911", compteTiers.get(0).getNumecompte());
    Assert.assertEquals("00011199922", compteTiers.get(1).getNumecompte());
    
  }
  
  @Test
  @Transactional(readOnly=true)
  public void testUpdateCompteTier() {
    // Controle de modification d'un beneficiaire (Compte tiers)
    CompteTiers cptTier = compteService.getCompteTierById(7);
    cptTier.setLibelle("LibModifie");
    compteService.saveComptetTiers(cptTier);
    
    Assert.assertEquals("LibModifie", compteService.getCompteTierById(7).getLibelle());
  }
    
  @Test
  @Transactional(readOnly=true)
  public void testDeleteCompteTier() {
    
    // Suppression du compte tiers
    compteService.deleteCompteTiers(9);
    try {
      CompteTiers cptTierSupp = compteService.getCompteTierById(9);
      Assert.fail("testDeleteCompteTier non réussi");
    }
    catch (Exception e) {
      System.out.println("testDeleteCompteTier réussi");
    }
  }

  
  @Test
  public void getCompteTierByIdTest() {

    List<CompteTiers> toto = compteTiersRepository.findAll();
    int cpttiers = 0;
    for (CompteTiers u : toto) {
      cpttiers++;
      System.out.println(u.getIdcompte());
    }
    Assert.assertEquals(3, cpttiers);
    
  }
}
