package esi.ws;

//import esi.ws.customerservice.service.CustomerService;
import esi.ws.helloworld.service.HelloService;

import javax.xml.ws.Endpoint;

public class WsStarter {

    public static void main(String[] argv) {
        Object implementor = new HelloService();
        Endpoint.publish("http://localhost:9000/helloworld", implementor);
//    Endpoint.publish("http://192.168.1.27:9000/helloworld", implementor);

//        Object customerservice = new CustomerService();
////    Endpoint.publish("http://192.168.1.27:9000/customerservice", customerservice);
//        Endpoint.publish("http://localhost:9000/customerservice", customerservice);
    }
}