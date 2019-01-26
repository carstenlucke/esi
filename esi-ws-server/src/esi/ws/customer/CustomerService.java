package esi.ws.customer;

import esi.ws.customer.dao.CustomerDAO;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface CustomerService {

    // TODO: Methoden des Webservice
    CustomerDAO[] getCustomers();
}

