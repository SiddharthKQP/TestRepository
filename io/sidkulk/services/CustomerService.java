package io.sidkulk.services;

import java.util.Map;
import java.util.TreeMap;
import io.sidkulk.model.Customer;
import java.util.Set;
import java.util.Collections;
import java.util.HashSet;

public class CustomerService {
	private Map<Integer, Customer> custMap = new TreeMap<>();
	private Set<Integer> custIdSet = new HashSet<>();

	public boolean addNewCustomer(Customer customer) {
		if (customer == null) {
			return false;
		} else {
			if (custIdSet.isEmpty()) {
				custIdSet.add(1);
			} else {
				int lastCustomerId = (int) Collections.max(custIdSet);
				int newCustomerId = lastCustomerId + 1;
				custMap.put(newCustomerId,
						new Customer(customer.getFname(), customer.getLname(), customer.getAddress()));
				custIdSet.add(newCustomerId);
			}

			return true;
		}
	}

	public boolean deleteCustomerById(int custId) {
		boolean isIdPresent = custMap.containsKey(custId);
		if (isIdPresent) {
			Customer removedCustomer = custMap.remove(custId);
			System.out.println("Customer removed from database: " + removedCustomer);
			return true;
		} else {
			return false;
		}
	}

	public String getAllCustomers() {
		return custMap.values().toString();
	}

	public boolean updateCustomerById(int custId, Customer updatedValues) {
		boolean isIdPresent = custMap.containsKey(custId);
		if (isIdPresent) {
			Customer updatedCustomer = custMap.get(custId);
			updatedCustomer.setFname(updatedValues.getFname());
			updatedCustomer.setLname(updatedValues.getLname());
			updatedCustomer.setAddress(updatedValues.getAddress());

			updatedCustomer = custMap.put(custId, updatedCustomer);
			return true;
		} else {
			return false;
		}
	}

	public Set<Integer> getAllCustomerIDs() {
		return custIdSet;
	}
}
