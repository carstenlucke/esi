package esi.ws.hello;

import javax.jws.WebService;

//Service Implementation
@WebService(endpointInterface = "esi.ws.hello.HelloWorld")  // package + class name of IF
public class HelloWorldImpl implements HelloWorld {

    @Override
    public String sayHelloWorldFrom(String from) {
        return "Hello World JAX-WS " + from;
    }

}