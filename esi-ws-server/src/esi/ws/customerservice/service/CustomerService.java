package esi.ws.customerservice.service;

import esi.ws.customerservice.dao.Customer;
import esi.ws.customerservice.database.CustomerDatabase;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService
public class CustomerService {

    @WebMethod
    public List<Customer> getCustomers() {
        return CustomerDatabase.getAllCustomers();
    }
}