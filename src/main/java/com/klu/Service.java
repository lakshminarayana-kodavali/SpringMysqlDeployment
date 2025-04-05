package com.klu;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service {
	@Autowired
	ProductRepo repo1;
	
	public List<Product> retrieveData()
	{
		return repo1.findAll();
	}
	
}
