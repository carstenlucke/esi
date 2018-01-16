package esi.ws.helloworld.service;

import javax.xml.ws.Endpoint;

public class Starter {

    public static void main(String[] argv) {
        Object implementor = new HelloService();
        Endpoint.publish("http://localhost:9000/helloworld", implementor);
//    Endpoint.publish("http://192.168.1.27:9000/helloworld", implementor);
    }
}