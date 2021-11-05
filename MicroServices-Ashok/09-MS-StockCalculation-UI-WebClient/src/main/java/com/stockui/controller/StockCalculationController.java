package com.stockui.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.stockui.service.StockCalculationService;

@Controller
public class StockCalculationController{
	
	@Autowired
	private StockCalculationService service;
	
	@GetMapping(value= {"/","page"})
	public String loadForm() {
		
		return "index";
	}
	
	@GetMapping("/getstockdtls")
	public String getStockPriceDtls(HttpServletRequest req,Model model) {
		
		     String companyName = req.getParameter("companyname");
		     String quantity = req.getParameter("quantity");
		     String totalStockPrice = service.getTotalStockPrice(companyName, Integer.parseInt(quantity));
		     model.addAttribute("msg", totalStockPrice);
		     return "index";
	}

}
