package esi.ws.helloworld.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

// TODO: Diese Klasse soll ein JAX_WS Service sein
public class HelloService {

    // TODO: Diese Methode soll der Service bereitstellen
    public String sayHelloWorldFrom(String from) {
        String result = "Hello, world, from " + from;
        System.out.println(result);
        return result;
    }
}