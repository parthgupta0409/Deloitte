package com.sonar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sonar.model.Address;
import com.sonar.service.AddressService;

@Controller
public class AddressController {

	@Autowired
	AddressService addressService;

	@RequestMapping(value = "/address", method = RequestMethod.GET)
	public String listAddress(Model model) {
		model.addAttribute("address", new Address());
		model.addAttribute("listAddress", this.addressService.listAddress());
		return "address";
	}
	
	@RequestMapping(value= "/address/add", method = RequestMethod.GET)
	public String addAddress(@ModelAttribute("address") Address a){
		System.out.println("#####address :"+a);
			this.addressService.addAddress(a);
		return "redirect:/address";
	}
	
	
	@RequestMapping("address/remove")
    public String removeAddress(@PathVariable("id") int id){
		
        this.addressService.removeAddress(id);
        return "redirect:/address";
    }

	  @RequestMapping("/get/{id}")
	    public String getAddress(@PathVariable("id") int id, Model model){
	        model.addAttribute("address", this.addressService.getAddressByCustomerId(id));
	        model.addAttribute("listAddress", this.addressService.listAddress());
	        return "address";
	    }
}
