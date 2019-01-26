<?php
/**
 * Created by IntelliJ IDEA.
 * User: clucke
 * Date: 10.01.18
 * Time: 03:27
 */

$client = new SoapClient("http://localhost:9000/helloworld?wsdl");
//var_dump($client->__getFunctions());
//var_dump($client->__getTypes());

var_dump($client->sayHelloWorldFrom("ESI in PHP-Skript"));