package fr.bicomat.controller;

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
import fr.bicomat.Service.CompteService;
import fr.bicomat.dao.PrelevementRepository;
import fr.bicomat.entities.Prelevement;
import fr.bicomat.entities.EtatPrelevement;

@Controller
public class PrelevementController {

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
  
	 @RequestMapping("/client/prelevement")
   public String getprelevement(Pageable pageable,
                              Model model) {

     Integer idclient = userService.getUserByssoId(getPrincipal()).getIdClient();
	   List<Prelevement> prelevement = compteService.getPrelevementByClient(idclient);
	   final Page<Prelevement> page = new PageImpl<>(prelevement);
	   model.addAttribute("page", page);
     return "client/prelevement";
   }
}
