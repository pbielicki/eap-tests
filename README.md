To test it use curl: `curl http://localhost:8080/eap-tests/GreetingService -X POST -d "<soapenv:Envelope xmlns:soapenv='http://schemas.xmlsoap.org/soap/envelope/' xmlns:test='http://test.com/'><soapenv:Header/><soapenv:Body><test:sayHello><arg0>test</arg0></test:sayHello></soapenv:Body></soapenv:Envelope>"`

Correct answer should look like this:
`<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"><soap:Body><ns2:sayHelloResponse xmlns:ns2="http://test.com/"><return><content>Thread: 138 test</content><id>3</id></return></ns2:sayHelloResponse></soap:Body></soap:Envelope>`