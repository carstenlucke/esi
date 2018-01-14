package esi.ws.customerservice.service;

import javax.xml.ws.Endpoint;

public class Starter {

    public static void main(String[] argv) {
        Object customerservice = new CustomerService();
//    Endpoint.publish("http://192.168.1.27:9000/customerservice", customerservice);
        Endpoint.publish("http://localhost:9000/customerservice", customerservice);
    }
}