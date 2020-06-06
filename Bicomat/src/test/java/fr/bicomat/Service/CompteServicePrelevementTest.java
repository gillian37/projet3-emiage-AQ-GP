package fr.bicomat.Service;

import static org.junit.Assert.*;

import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.hibernate.Query;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import org.hibernate.*;
import fr.bicomat.entities.Client;
import fr.bicomat.entities.Compte;
import fr.bicomat.entities.CompteClient;
import fr.bicomat.entities.CompteTiers;
import fr.bicomat.entities.EtatPrelevement;
import fr.bicomat.entities.Prelevement;
import fr.bicomat.entities.TypeCompte;
import fr.bicomat.Auth.dao.UserAppRepository;
import fr.bicomat.Auth.entities.User_App;
import fr.bicomat.Service.ClientService;
import fr.bicomat.Service.CompteService;
import fr.bicomat.dao.AlerteRepository;
import fr.bicomat.dao.CompteClientRepository;
import fr.bicomat.dao.CompteRepository;
import fr.bicomat.dao.CompteTiersRepository;
import fr.bicomat.dao.PrelevementRepository;


@RunWith(SpringRunner.class)
@SpringBootTest


public class CompteServicePrelevementTest {

  @Autowired
  private CompteService compteService;
  @Autowired
  private PrelevementRepository prelevementRepository;

  @Test
  public void testGetPrelevementByClient() {
    
    // Récupération de tous les prelevements tout client confondu
    List<Prelevement> allPrl = prelevementRepository.findAll();
    
    int cptprl = 0;
    for (Prelevement u : allPrl) {
      cptprl++;
    }
    Assert.assertEquals(3, cptprl);
    
    
    // Vérification de la bonne récupération des comptes tiers via le service
    List<Prelevement> prlv = compteService.getPrelevementByClient(9);

    Assert.assertEquals("ORANGE MOBILE", prlv.get(0).getLibelle());
    Assert.assertEquals("MAAF ASSURANCE", prlv.get(1).getLibelle());
    prlv.forEach(System.out::println);
    
  }
  
  @Test
  @Transactional(readOnly=true)
  public void testUpdatePrelevement() {
    
    // Controle de modification d'un beneficiaire (Compte tiers)
    Prelevement prl = compteService.getPrelevementById(1);
    prl.setLibelle("LibModifie");
    try {
      compteService.savePrelevement(prl);
    } catch (Exception e) {
      System.out.println("Erreur : "+e);
    }
    
    Assert.assertEquals("LibModifie", compteService.getPrelevementById(1).getLibelle());
  }
  
  @Test
  @Transactional(readOnly=true)
  public void testAddPrelevement() {
    
    Prelevement prladd = compteService.addPrelevement(4, 5, "20231231", "A", "ABO SPORT", 25);

    Assert.assertEquals("ABO SPORT", prladd.getLibelle());
  }
  
  @Test
  @Transactional(readOnly=true)
  public void testDeletePrelevement() {
    
      // Suppression du prelevement
      Assert.assertEquals(true, compteService.deletePrelevement(3));
      try {
        Prelevement prldel = compteService.getPrelevementById(3);
        Assert.fail("testDeletePrelevement non réussie");
      } catch (Exception e) {
        // OK
        System.out.println("testDeletePrelevement réussie");
      }
  }
  
  @Test
  @Transactional(readOnly=true)
  public void testOppositionSurPrelevement() {

      // Opposition du prelevement
      Assert.assertEquals(true, compteService.OppositionSurPrelevement(2));

      String etat = compteService.getPrelevementById(2).getEtatPrelevement();
      Assert.assertEquals(EtatPrelevement.DEMANDE_OPPOSITION.getCode(), etat);
  }
}
