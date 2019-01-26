package esi.ws.customer;

import esi.ws.customer.dao.CustomerDAO;
import esi.ws.customer.dao.Gender;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;

@WebService(endpointInterface = "esi.ws.customer.CustomerService") // package + class name of IF
public class CustomerServiceImpl implements CustomerService {

    private static final int SIZE_CUST_ARRAY = 3;


    @WebMethod
    @XmlElement
    public CustomerDAO[] getCustomers() {
        return _getAllCustomers();
    }


    private static CustomerDAO[] _getAllCustomers() {
        CustomerDAO[] data = new CustomerDAO[SIZE_CUST_ARRAY];
        data[0] = new CustomerDAO(
                "Max",
                "Mustermann",
                "mm@web.de",
                Gender.MALE,
                "156.45.22.145");

        data[1] = new CustomerDAO(
                "John",
                "Doe",
                "john@doe.com",
                Gender.MALE,
                "226.4.12.14");

        data[2] = new CustomerDAO(
                "Jane",
                "Doe",
                "jane@doe.com",
                Gender.FEMALE,
                "226.4.12.14");

        return data;
    }
}