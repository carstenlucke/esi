package esi.ws.hello;

import javax.xml.ws.Endpoint;

//Endpoint publisher
public class HelloStarter {

    public static void main(String[] args) {
        String url = "http://localhost:9000/helloworld";
        Endpoint.publish(url, new HelloWorldImpl());
        // TODO: Endpoint.publish(...);
        System.out.println("Starte HelloWorld: " + url + ". WSDL siehe " + url + "?wsdl");
    }

}