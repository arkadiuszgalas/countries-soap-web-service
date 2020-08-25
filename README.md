# getCountryRequest web service  
SOAP web service returning country's data: official name, population, capital, currency and country ISO 3166 code.
# Java version  
12.0.2+10

Service can be invoked for 6 ISO 3166 codes:
1. AL (Albania)
2. AD (Andorra)
3. DE (Germany)
4. PL (Poland)
5. ES (Spain)
6. GB (United Kingdom)

Request example:
```xml
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:gs="http://spring.io/guides/gs-producing-web-service">
    <soapenv:Header/>
    <soapenv:Body>
        <gs:getCountryRequest>
            <gs:isocode>AD</gs:isocode>
        </gs:getCountryRequest>
    </soapenv:Body>
</soapenv:Envelope>
```
Response:
```xml
<SOAP-ENV:Envelope xmlns:SOAP-ENV="http://schemas.xmlsoap.org/soap/envelope/">
   <SOAP-ENV:Header/>
   <SOAP-ENV:Body>
      <ns2:getCountryResponse xmlns:ns2="http://spring.io/guides/gs-producing-web-service">
         <ns2:country>
            <ns2:name>Principality of Andorra</ns2:name>
            <ns2:population>85458</ns2:population>
            <ns2:capital>Andorra la Vella</ns2:capital>
            <ns2:currency>EUR</ns2:currency>
            <ns2:isocode>AD</ns2:isocode>
         </ns2:country>
      </ns2:getCountryResponse>
   </SOAP-ENV:Body>
</SOAP-ENV:Envelope>
```