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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fr.bicomat.Auth.service.UserService;
import fr.bicomat.Service.CompteService;
import fr.bicomat.dao.AlerteRepository;
import fr.bicomat.dao.CompteRepository;
import fr.bicomat.dao.CompteTiersRepository;
import fr.bicomat.entities.Alerte;
import fr.bicomat.entities.Compte;
import fr.bicomat.entities.CompteTiers;

@Controller
public class CompteTiersController {

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
  
   
	 @RequestMapping("/client/comptetiers")
   public String getcomptetiers(Pageable pageable,
                              Model model) {

     Integer idclient = userService.getUserByssoId(getPrincipal()).getIdClient();
	   List<CompteTiers> comptetiers = compteService.getCompteTierByClient(idclient);
	   final Page<CompteTiers> page = new PageImpl<>(comptetiers);
	   model.addAttribute("page", page);
     return "client/comptetiers";
   }
	 /*TENTATIVE DEV 
   @RequestMapping("/client/updatetiers")
   public String updatecomptetiers(Pageable pageable,
                              Model model) {
     return "client/comptetiers";
   }
   
   @RequestMapping("/client/deletetiers")
   public String deletecomptetiers(Pageable pageable,
                              Model model) {
     return "client/comptetiers";
   }
   */
}
