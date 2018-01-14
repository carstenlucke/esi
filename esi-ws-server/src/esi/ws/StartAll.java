package esi.ws;

import esi.ws.customerservice.service.CustomerService;
import esi.ws.helloworld.service.HelloService;

import javax.xml.ws.Endpoint;
import java.util.HashMap;
import java.util.Map;

public class StartAll {


    final static Map<String, Class> endpoints = new HashMap();
    public static final String BASEURL = "http://localhost:9000";

    static {
        endpoints.put("/helloworld", HelloService.class);
        endpoints.put("/customerservice", CustomerService.class);
    }


    public static void main(String[] argv) {

        for (Map.Entry<String, Class> entry : endpoints.entrySet()) {
            try {
                Object serviceInstance = entry.getValue().newInstance();
                String serviceUrl = BASEURL + entry.getKey();

                Endpoint.publish(serviceUrl, serviceInstance);
                System.err.println("Publishing endpoint: " + entry.getKey() + " using URL: " + serviceUrl);

            } catch (InstantiationException e) {
                e.printStackTrace();
                continue;

            } catch (IllegalAccessException e) {
                e.printStackTrace();
                continue;
            }
        }

    }

}