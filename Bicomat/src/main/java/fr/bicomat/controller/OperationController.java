package fr.bicomat.controller;


import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/client")
public class OperationController {
		
	@RequestMapping(value = "/operations")
	public String getOperationSearchForm(Pageable pageable, Model model) {

		return "client/operations";
	}
}
