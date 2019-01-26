package com.othercorp.ws;


import esi.ws.customer.CustomerService;
import esi.ws.customer.dao.CustomerDAO;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

public class CustomerServiceClient {
    public static void main(String[] args) throws Exception {

        // TODO: URL zum WSDL-File
        URL url = new URL("http://...");

        //TODO: 1st argument service URI: Siehe WSDL-File:  targetNamespace="http://..."
        //TODO: 2nd argument is service name: Siehe WSDL-File: name="..."
        QName qname = new QName("attrib: targetNamespace", "attrib name");

        Service service = Service.create(url, qname);

        CustomerService srvc = service.getPort(CustomerService.class);

        //TODO: Service-call ausführen und Kundendatenabrufen sowie ausgeben

    }
}
