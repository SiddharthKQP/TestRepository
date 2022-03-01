package io.sidkulk;

import java.util.Map;
import java.util.TreeMap;
import io.sidkulk.model.Customer;

public class CustomerService {
	private Map<Integer, Customer> custMap = new TreeMap<>();
	public boolean addNewCustomer(Customer customer) {
		if(customer == null) {
			return false;
		} else {
			custMap.put(customer.getId(), new Customer(customer.getFname(), customer.getLname(), customer.getAddress()));
			return true;
		}
	}
	
	public boolean deleteCustomerById(int custId) {
		boolean isIdPresent = custMap.containsKey(custId);
		if(isIdPresent) {
			Customer removedCustomer = custMap.remove(custId);
			System.out.println("Customer removed from database: " + removedCustomer);
			return true;
		} else {
			return false;
		}
	}
}
