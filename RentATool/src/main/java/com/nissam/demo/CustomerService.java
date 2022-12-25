package com.nissam.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerService {
	
	@Autowired
	Jpacustomerrepo jpacustomerrepo;
	@Autowired
	Jpatoolrepo jpatoolrepo;
	
	@RequestMapping("customers")
	public ArrayList<Customer> getCustomers()
	{
		//System.out.println("in add cus");
		ArrayList<Customer> customers = (ArrayList<Customer>)jpacustomerrepo.findAll();
		return  customers;
	}
	@PostMapping("addcustomer")	
	public void addcustomer(Customer c)
	{
		jpacustomerrepo.save(c);
	}
	
	

}
