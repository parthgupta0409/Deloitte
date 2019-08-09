package com.pms.deloitte.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.pms.deloitte.model.Product;


public interface ProductService {

	public void addProduct(Product p);
	public void updateProduct(Product p);
	public List<Product> listProducts();
	public Product getProductById(Integer  id);
	public void removeProduct(int id);
	
}
