package com.klu;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class AppController {
		
    @Autowired
    Service s;
             
    //http://localhost:8080/product
    @GetMapping("/product")
    public List<Product> retrieveProduct()
    {
    	return s.retrieveData();
    }
    @GetMapping("/message")
	public String msg() {
		String univ = "KLEF";
		return " I study at " + univ;
	}
  

}
