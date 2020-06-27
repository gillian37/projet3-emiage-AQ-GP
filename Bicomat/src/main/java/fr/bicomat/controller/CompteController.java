package fr.bicomat.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import fr.bicomat.Auth.service.UserService;
import fr.bicomat.Service.ClientService;
import fr.bicomat.Service.CompteService;
import fr.bicomat.entities.Client;
import fr.bicomat.entities.Compte;
import fr.bicomat.entities.CompteClient;

@Controller
public class CompteController {
	
	@Autowired
	private ClientService clientService;

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
	
	@RequestMapping("/client/comptes")
	  public String getComptes(Pageable pageable, Model model) {
		
		Client client = clientService.getClientById(userService.getUserByssoId(getPrincipal()).getIdClient());
		List<Compte> comptes = new ArrayList<Compte>();
		comptes.addAll(client.getComptes());

	    Page<Compte> page = new PageImpl<>(comptes);
	    	    
	    model.addAttribute("page", page);
		return "client/comptes";
	  }
	
	@RequestMapping(value = "/client/iban", method = RequestMethod.GET)
	@ResponseBody
	public Compte getIban(Pageable pageable, Model model, String idCompte) {
		
		CompteClient compte = compteService.getCompteClientById(Integer.parseUnsignedInt(idCompte));		
		return compte;
	}

}
