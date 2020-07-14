package fr.bicomat.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.bicomat.Auth.service.UserService;
import fr.bicomat.Service.ClientService;
import fr.bicomat.entities.Client;
import fr.bicomat.entities.Compte;

@Controller
public class ClientController {
	
	@Autowired
	ClientService clientService;
	
	@Autowired
	UserService userService;
	
	
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
	
	@RequestMapping("/client/profil/")
	  public String getalerte(Pageable pageable, Model model) {
		
		Client client = clientService.getClientById(userService.getUserByssoId(getPrincipal()).getIdClient());
	    	    
	    model.addAttribute("client", client);
	      return "client/profil";
	  }
	
	@RequestMapping("/client/displayRegulations")
	  public String getalerte1(Pageable pageable, Model model) {
		
		Client client = clientService.getClientById(userService.getUserByssoId(getPrincipal()).getIdClient());
	    	    
	    model.addAttribute("client", client);
	      return "displayRegulations";
	  }
	
	
	
}
