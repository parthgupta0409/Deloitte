package com.pms.deloitte.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pms.deloitte.model.Product;
import com.pms.deloitte.service.ProductService;

@Controller
public class ProductController {
	
	@Autowired
	private ProductService productService;
	

	@RequestMapping(value = "/products", method = RequestMethod.GET)
	public String listProducts(Model model) {
		model.addAttribute("product", new Product());
		model.addAttribute("listProducts", this.productService.listProducts());
		return "product";
	}
	
	//For add and update person both
	@RequestMapping(value= "/product/add", method = RequestMethod.POST)
	public String addProduct(@ModelAttribute("product") Product p){
		System.out.println("#####product :"+p);
			this.productService.addProduct(p);
		return "redirect:/products";
	}

	@RequestMapping(value= "/edit/add/update", method = RequestMethod.POST)
	public String updateProduct(@ModelAttribute("product") Product p){
		System.out.println("#####product updating :"+p);
			this.productService.updateProduct(p);
		return "redirect:/products";
	}
	
	
	@RequestMapping("/remove/{id}")
    public String removeProduct(@PathVariable("id") int id){
		
        this.productService.removeProduct(id);
        return "redirect:/products";
    }
//	@RequestMapping("/remove/{name}")
//    public String removePerson(@PathVariable("name") String name){
//		
//        this.personService.removePerson(name);
//        return "redirect:/persons";
//    }
 
    @RequestMapping("/edit/{id}")
    public String editProduct(@PathVariable("id") int id, Model model){
        model.addAttribute("product", this.productService.getProductById(id));
        model.addAttribute("listProducts", this.productService.listProducts());
        return "product";
    }
	
}
