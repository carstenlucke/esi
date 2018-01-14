package com.othercorp.ws;

import esi.ws.customerservice.service.Customer;
import esi.ws.customerservice.service.CustomerService;
import esi.ws.customerservice.service.CustomerServiceService;

import java.util.List;

public class CustomerServiceClient {


    public static void main(String[] args) {
        CustomerServiceService service = new CustomerServiceService();
        CustomerService port = service.getCustomerServicePort();

        List<Customer> customers = port.getCustomers();

        for (Customer c: customers) {
            System.out.println(c.getFirstName() + " " + c.getLastName() + " <" + c.getEmail() + ">");
        }

    }
}