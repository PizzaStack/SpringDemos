# SOAP + Spring MVC + Apache CXF
Contract Last approach to generating a JAX-WS implementation of a Soap service with Apache CXF. SEI (Service Endpoint Interface) set as com.revature.soap.ArtistServiceImpl.

### WSDL generated at:
http://localhost:8080/apache-cxf-soap/Artists?wsdl

### Send a message (text/xml):
```xml
<Envelope xmlns="http://schemas.xmlsoap.org/soap/envelope/">
    <Body>
        <getHelloWorld xmlns="http://soap.revature.com/">
            <arg0 xmlns="">YourNameHere</arg0>
        </getHelloWorld>
    </Body>
</Envelope>
```