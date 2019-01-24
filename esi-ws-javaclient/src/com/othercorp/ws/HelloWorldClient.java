package com.othercorp.ws;

import esi.ws.hello.HelloWorld;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

public class HelloWorldClient {


    public static void main(String[] args) throws Exception {

        URL url = new URL("http://localhost:9000/helloworld?wsdl");

        //1st argument service URI, refer to wsdl document above
        //2nd argument is service name, refer to wsdl document above
        QName qname = new QName("http://hello.ws.esi/", "HelloWorldImplService");

        Service service = Service.create(url, qname);

        HelloWorld hello = service.getPort(HelloWorld.class);

        System.out.println(hello.sayHelloWorldFrom("ESI @ DHBW"));

    }

}
