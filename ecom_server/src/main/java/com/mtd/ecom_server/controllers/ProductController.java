package com.mtd.ecom_server.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mtd.ecom_server.models.Product;
import com.mtd.ecom_server.repos.ProductRepo;

@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired ProductRepo productRepo;
	
	
	@GetMapping("/all")
	public List<Product> getAllPRoducts(){
		return productRepo.findAll();
	}
}
