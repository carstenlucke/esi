package esi.ws.hello;

//Endpoint publisher
public class HelloStarter {

    public static void main(String[] args) {
        String url = "http://localhost:9000/helloworld";

        // TODO: Endpoint.publish(...);
        System.out.println("Starte HelloWorld: " + url + ". WSDL siehe " + url + "?wsdl");
    }

}