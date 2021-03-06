package app.wllfengshu.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import app.wllfengshu.entity.Customer;

@Repository
public interface CustomerDao {
	public List<Customer> getCustomers(
			@Param("user_id")String user_id,
			@Param("name")String name, 
			@Param("phone")String phone, 
			@Param("email")String email, 
			@Param("pageStart")int pageStart, 
			@Param("pageEnd")int pageEnd);

	public int getCount(
			@Param("user_id")String user_id,
			@Param("name")String name, 
			@Param("phone")String phone, 
			@Param("email")String email);
	
	public void addCustomer(@Param("customer")Customer customer);

	public Customer getCustomer(@Param("id")String id);

	public void updateCustomer(@Param("customer")Customer customer);

	public void deleteCustomer( @Param("id")String id);
	
}
