<?php
/**
 * Created by IntelliJ IDEA.
 * User: clucke
 * Date: 10.01.18
 * Time: 03:33
 */

$client = new SoapClient("http://localhost:9000/customerservice?wsdl");
//var_dump($client->__getFunctions());
//var_dump($client->__getTypes());

print_r($client->getCustomers());