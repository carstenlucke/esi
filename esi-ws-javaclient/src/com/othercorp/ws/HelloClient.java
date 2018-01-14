package com.othercorp.ws;

import esi.ws.helloworld.service.HelloService;
import esi.ws.helloworld.service.HelloServiceService;

public class HelloClient {

    public static void main(String[] args) {
        HelloServiceService service = new HelloServiceService();
        HelloService port = service.getHelloServicePort();

        System.out.println(port.sayHelloWorldFrom("Tester"));

    }
}