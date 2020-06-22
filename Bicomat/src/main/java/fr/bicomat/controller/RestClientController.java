package fr.bicomat.controller;


import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.bicomat.Utils;
import fr.bicomat.Auth.service.UserService;
import fr.bicomat.Service.BanqueService;
import fr.bicomat.Service.CompteService;
import fr.bicomat.dao.AlerteRepository;

import fr.bicomat.entities.Alerte;
import fr.bicomat.entities.CarteBancaire;
import fr.bicomat.entities.Client;
import fr.bicomat.entities.CompteClient;
import fr.bicomat.entities.Operation;

@RestController
@RequestMapping("/api/client")
public class RestClientController {
	@Autowired
	private AlerteRepository AlerteRepository;
	
	@Autowired
	private BanqueService banqueservice;
	
	@Autowired
	private CompteService compteService;

	@Autowired
	private UserService userService;
		
	private String getPrincipal(){
	      String userName = null;
	      Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
	  
	      if (principal instanceof UserDetails) {
	        userName = ((UserDetails)principal).getUsername();
	      } else {
	        userName = principal.toString();
	      }
	      return userName;
	    }
		@RequestMapping(value = "/listalerte", method = RequestMethod.GET)
	Page<Alerte> employeesPageable( Pageable pageable) {
		return AlerteRepository.findAll(pageable);
	}
	
	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public List<Client> getGestCompteAgent(ModelMap model,String reponse,String chercher ) {

		try {

			if (reponse.equals("yes")) {
				CarteBancaire cb=banqueservice.getCarteNumcarte(chercher);	
				return banqueservice.getClientByCarte(cb);

			}
			if (reponse.equals("no")) {
				return banqueservice.getClientByNom(chercher);
				
			}
		} catch (Exception e) {
			System.out.println(e );
		}


		return null;
	}
	
	@RequestMapping(value = "/searchOperations", method = RequestMethod.GET)
	public List<Operation> getOperationsByDate(ModelMap model, String dateDebut, String dateFin) throws ParseException {

		try {

			CompteClient compte = compteService.getCompteClientById(userService.getUserByssoId(getPrincipal()).getIdClient());
			return compteService.listerOperations(compte, Utils.convertFrToEn(dateDebut), Utils.convertFrToEn(dateFin));
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}
	
	@RequestMapping(value = "/pointerOperation", method = RequestMethod.GET)
	public void pointerEcriture(ModelMap model, Long idOperation) {
		compteService.PointerSurOperation(idOperation);
	}

}
