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
	CyclistService cycllistService;
	
	
	
	@GetMapping("/show")
	public String listCyclists(Model theModel){
		
		List<Cyclist> theCyclist = cycllistService.getCyclists();
		
		theModel.addAttribute("cyclists",theCyclist);
		
		return "show-cyclist"; 
	}
	

	
	@GetMapping("/showFormForAdd")
	public String showFormForaAdd(Model theModel){
		Cyclist theCyclist = new Cyclist();
		
		theModel.addAttribute("cyclist",theCyclist);
		
		return "form-for-add"; 
	}
	
	
	@GetMapping("/showFormForUpdate")
	public String showFormForaAdd(@RequestParam("cyclistId")int theId,Model theModel){
	
		//get the customer from database
		Cyclist theCyclist = CyclistService.getCyclist(theId);
		
		theModel.addAttribute("cyclist",theCyclist);
		
		
		return "cyclist-form"; 
	}
	
	
	
	
	@PostMapping("/saveCyclist")
	public String saveCyclist(@ModelAttribute("cyclist") Cyclist theCyclist){
		cycllistService.saveCyclists(theCyclist);
	return "redirect:/cyclist/show";
	}
	}