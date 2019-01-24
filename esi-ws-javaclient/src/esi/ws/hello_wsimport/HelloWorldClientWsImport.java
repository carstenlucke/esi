package esi.ws.hello_wsimport;


public class HelloWorldClientWsImport {


    public static void main(String[] args) {

        HelloWorldImplService helloService = new HelloWorldImplService();
        HelloWorld hello = helloService.getHelloWorldImplPort();

        System.out.println(hello.sayHelloWorldFrom("WS-imported client stub"));

    }

}
