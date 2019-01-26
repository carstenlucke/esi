package esi.ws.customer;


import javax.xml.ws.Endpoint;

//Endpoint publisher
public class CustSrvcStarter {

    public static void main(String[] args) {
        String url = "http://localhost:9000/customerservice";
        Endpoint.publish(url, new CustomerServiceImpl());
        // TODO: Endpoint.publish(...);
        System.out.println("Starte CustomerService: " + url + ". WSDL siehe " + url + "?wsdl");
    }

}