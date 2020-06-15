package fr.bicomat.controller;

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

import fr.bicomat.Auth.service.UserService;
import fr.bicomat.Service.ClientService;
import fr.bicomat.Service.DocumentService;
import fr.bicomat.dao.DocumentRepository;
import fr.bicomat.entities.Client;
import fr.bicomat.entities.Document;
import fr.bicomat.entities.Prelevement;

@Controller
public class DocumentController {
	
	@Autowired
	DocumentService documentService;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private ClientService clientService;
	
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
	
	@RequestMapping("/client/documents")
	public String getDocuments(Pageable pageable, Model model) {
		
		Client client = clientService.getClientById(userService.getUserByssoId(getPrincipal()).getIdClient());

	    List<Document> documents = documentService.retournerContrats(client);
	    Page<Document> page = new PageImpl<>(documents);
	    model.addAttribute("page", page);
	    return "client/documents";
	}

}
