package io.sidkulk;

import io.sidkulk.exceptions.CustomerNotAddedException;
import io.sidkulk.model.Customer;
import io.sidkulk.services.CustomerService;

public class App {
    private CustomerService customerService;

    public App() {
        this.customerService = new CustomerService();
    }

    public void addNewCustomer(Customer customer) {
        boolean isAdded = customerService.addNewCustomer(customer);
        if (!isAdded) {
            throw new CustomerNotAddedException("Unable to add " + customer);
        }
    }

    public String getAllCustomers() {
        return customerService.getAllCustomers();
    }

    public void showAllCustomerIDs() {
        customerService.getAllCustomerIDs().stream().forEach(id -> System.out.println(id));
    }
}
