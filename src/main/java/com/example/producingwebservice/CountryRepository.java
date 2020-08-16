package com.example.producingwebservice;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

import io.spring.guides.gs_producing_web_service.Country;
import io.spring.guides.gs_producing_web_service.Currency;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

@Component
public class CountryRepository {
    private static final Map<String, Country> countries = new HashMap<>();

    @PostConstruct
    public void initData() {
        Country andorra = new Country();
        andorra.setName("Andorra");
        andorra.setCapital("Andorra la Vella");
        andorra.setCurrency((Currency.EUR));
        andorra.setPopulation(85458);
        andorra.setIsocode("AD");

        countries.put(andorra.getIsocode(), andorra);

        Country albania = new Country();
        albania.setName("Albania");
        albania.setCapital("Tirana");
        albania.setCurrency(Currency.ALL);
        albania.setPopulation(3020209);
        albania.setIsocode("AL");

        countries.put(albania.getIsocode(), albania);

        Country germany = new Country();
        germany.setName("Germany");
        germany.setCapital("Berlin");
        germany.setCurrency(Currency.EUR);
        germany.setPopulation(80996685);
        germany.setIsocode("DE");

        countries.put(germany.getIsocode(), germany);

        Country poland = new Country();
        poland.setName("Poland");
        poland.setCapital("Warsaw");
        poland.setCurrency(Currency.PLN);
        poland.setPopulation(38346279);
        poland.setIsocode("PL");

        countries.put(poland.getIsocode(), poland);

        Country spain = new Country();
        spain.setName("Spain");
        spain.setCapital("Madrid");
        spain.setCurrency(Currency.EUR);
        spain.setPopulation(47737941);
        spain.setIsocode("ES");

        countries.put(spain.getIsocode(), spain);

        Country uk = new Country();
        uk.setName("United Kingdom");
        uk.setCapital("London");
        uk.setCurrency(Currency.GBP);
        uk.setPopulation(63742977);
        uk.setIsocode("GB");

        countries.put(uk.getIsocode(), uk);
    }

    public Country findCountry(String name) {
        Assert.notNull(name, "The country's name must not be null");
        return countries.get(name);
    }
}