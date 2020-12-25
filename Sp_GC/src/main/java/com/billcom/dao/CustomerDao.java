package com.billcom.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.billcom.model.Customers;
@Mapper
public interface CustomerDao {
	public List<Customers> getAll();
	public List<Customers> searchCustomer(@Param("code") String code,@Param("Fname") String Fname,@Param("Lname") String Lname,@Param("cin") Integer cin);
	public  void CreateCustomer(@Param("c") Customers c);
}
