package com.othercorp.ws;

import esi.ws.hello.HelloWorld;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

public class HelloWorldClient {


    public static void main(String[] args) throws Exception {

        // TODO: URL zum WSDL-File
        URL url = new URL("http://...");

        //TODO: 1st argument service URI: Siehe WSDL-File:  targetNamespace="http://..."
        //TODO: 2nd argument is service name: Siehe WSDL-File: name="..."
        QName qname = new QName("attrib: targetNamespace", "attrib name");

        Service service = Service.create(url, qname);

        HelloWorld hello = service.getPort(HelloWorld.class);

        //TODO: Service-call ausführen und "Hallo" sagen.

    }

}
