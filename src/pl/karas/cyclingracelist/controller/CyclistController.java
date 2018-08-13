package pl.karas.cyclingracelist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import pl.karas.cyclingracelist.entity.Cyclist;
import pl.karas.cyclingracelist.service.CyclistService;

@Controller
@RequestMapping("/cyclist")
public class CyclistController {
	
	@Autowired
	private CyclistService cyclistService;
	
	@GetMapping("/show")
	public String listCyclists(Model theModel){
		
		List<Cyclist> theCyclist = cyclistService.getCyclists();
		
		theModel.addAttribute("cyclists",theCyclist);
		
		return "show-cyclist"; 
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel){
		Cyclist theCyclist = new Cyclist();
		
		theModel.addAttribute("cyclist",theCyclist);
		
		return "form-for-add"; 
	}
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("cyclistId")int theId,Model theModel){
	
		//get the customer from database
		Cyclist theCyclist = cyclistService.getCyclist(theId);
		
		theModel.addAttribute("cyclist", theCyclist);
		
		return "form-for-add"; 
	}
	 
	
	@PostMapping("/saveCyclist")
	public String saveCyclist(@ModelAttribute("cyclist") Cyclist theCyclist){
		cyclistService.saveCyclists(theCyclist);
	return "redirect:/cyclist/show";
	}
	}
