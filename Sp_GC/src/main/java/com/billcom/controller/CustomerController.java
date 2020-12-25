package com.billcom.controller;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.billcom.dao.CustomerDao;
import com.billcom.model.Customers;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/Customer")
public class CustomerController {

	private CustomerDao customerDao;
	public CustomerController(CustomerDao customerDao) {

		this.customerDao = customerDao;
	}

	
	@GetMapping("/Getall")
	public List<Customers> Getall() {
		return customerDao.getAll();
	}
	@GetMapping("/GetCustomer")
	public List<Customers> getCustomer(@RequestParam (name="code",required=false) String code,@RequestParam (name="Fname",required=false)  String Fname,@RequestParam (name="Lname",required=false)  String Lname,@RequestParam (name="cin",required=false) Integer cin) {
		//Lname=null;
		//code=null;
		return  customerDao.searchCustomer(code,Fname,Lname,cin);
	}

	@PostMapping("/createcustomer")
	public String CreateCustomer(@RequestBody Customers c) {
		customerDao.CreateCustomer(c);
		return "saved successfully";
	}

}
