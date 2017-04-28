package org.com.shop.controller;

import java.io.BufferedReader;

import javax.servlet.http.HttpServletRequest;

import org.com.shop.service.SubscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SubscriptionController {
	
	@Autowired
	SubscriptionService service ;
	
	@RequestMapping(value = "/subscribe", method = RequestMethod.GET)
	public String subscribePage(HttpServletRequest request) {
		String orderDetails = getOrderDetails(request);

		String truncatedOrderDetails = service.truncate(orderDetails, 250);
		System.out.println("truncated files"+truncatedOrderDetails);
		log(truncatedOrderDetails);

		return "hello";

	}
	
	private String getOrderDetails(HttpServletRequest request) {

		StringBuilder sb = new StringBuilder();
		String line = null;
		try {
			BufferedReader reader = request.getReader();
			while ((line = reader.readLine()) != null) {
				sb.append(line);
			}
		} catch (Exception e) { 
			
		}

		return sb.toString();
	}
	
	private void log(String truncatedOrderDetails) {

	}
}