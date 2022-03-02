package io.sidkulk;

import io.sidkulk.model.Customer;

public class Driver {
    public static void main(String[] args) {
        App myApp = new App();
        myApp.addNewCustomer(new Customer("Sid", "Kulk", "Pune"));
        myApp.addNewCustomer(new Customer("Ram", "Kumar", "Bihar"));
        myApp.addNewCustomer(new Customer("Hari", "Chandra", "Ambala"));

        System.out.println(myApp.getAllCustomers());
        myApp.showAllCustomerIDs();
    }
}
