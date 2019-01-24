package com.othercorp.ws;


import esi.ws.customer.CustomerService;
import esi.ws.customer.dao.CustomerDAO;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

public class CustomerServiceClient {
    public static void main(String[] args) throws Exception {

        URL url = new URL("http://localhost:9000/customerservice?wsdl");

        //1st argument service URI, refer to wsdl document above
        //2nd argument is service name, refer to wsdl document above
        QName qname = new QName("http://customer.ws.esi/", "CustomerServiceImplService");

        Service service = Service.create(url, qname);

        CustomerService srvc = service.getPort(CustomerService.class);

        for(CustomerDAO c : srvc.getCustomers()) {
            System.out.println(c);
        }

    }
}
