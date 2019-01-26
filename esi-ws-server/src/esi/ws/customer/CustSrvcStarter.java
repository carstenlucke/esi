package esi.ws.customer;


//Endpoint publisher
public class CustSrvcStarter {

    public static void main(String[] args) {
        String url = "http://localhost:9000/customerservice";

        // TODO: Endpoint.publish(...);
        System.out.println("Starte CustomerService: " + url + ". WSDL siehe " + url + "?wsdl");
    }

}