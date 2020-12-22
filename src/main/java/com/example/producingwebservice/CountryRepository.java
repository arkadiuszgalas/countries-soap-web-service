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
        andorra.setName("Principality of Andorra");
        andorra.setCapital("Andorra la Vella");
        andorra.setCurrency((Currency.EUR));
        andorra.setPopulation(85458);
        andorra.setIsocode("AD");

        countries.put(andorra.getIsocode(), andorra);

        Country albania = new Country();
        albania.setName("Republic of Albania");
        albania.setCapital("Tirana");
        albania.setCurrency(Currency.ALL);
        albania.setPopulation(3020209);
        albania.setIsocode("AL");

        countries.put(albania.getIsocode(), albania);

        Country austria = new Country();
        austria.setName("Republic of Austria");
        austria.setCapital("Vienna");
        austria.setCurrency(Currency.EUR);
        austria.setPopulation(8902600);
        austria.setIsocode("AT");

        countries.put(austria.getIsocode(), austria);

        Country belgium = new Country();
        belgium.setName("Kingdom of Belgium");
        belgium.setCapital("Brussels");
        belgium.setCurrency(Currency.EUR);
        belgium.setPopulation(11492641);
        belgium.setIsocode("BE");

        countries.put(belgium.getIsocode(), belgium);

        Country belarus = new Country();
        belarus.setName("Republic of Belarus");
        belarus.setCapital("Minsk");
        belarus.setCurrency(Currency.BYN);
        belarus.setPopulation(9408400);
        belarus.setIsocode("BY");

        countries.put(belarus.getIsocode(), belarus);

        Country bosnia = new Country();
        bosnia.setName("Republic of Bosnia and Herzegovina");
        bosnia.setCapital("Sarajevo");
        bosnia.setCurrency(Currency.BAM);
        bosnia.setPopulation(3871643);
        bosnia.setIsocode("BA");

        countries.put(bosnia.getIsocode(), bosnia);

        Country bulgaria = new Country();
        bulgaria.setName("Republic of Bulgaria");
        bulgaria.setCapital("Sofia");
        bulgaria.setCurrency(Currency.BGN);
        bulgaria.setPopulation(6924716);
        bulgaria.setIsocode("BG");

        countries.put(bulgaria.getIsocode(), bulgaria);

        Country germany = new Country();
        germany.setName("Federal Republic of Germany");
        germany.setCapital("Berlin");
        germany.setCurrency(Currency.EUR);
        germany.setPopulation(80996685);
        germany.setIsocode("DE");

        countries.put(germany.getIsocode(), germany);

        Country poland = new Country();
        poland.setName("Republic of Poland");
        poland.setCapital("Warsaw");
        poland.setCurrency(Currency.PLN);
        poland.setPopulation(38346279);
        poland.setIsocode("PL");

        countries.put(poland.getIsocode(), poland);

        Country spain = new Country();
        spain.setName("Kingdom of Spain");
        spain.setCapital("Madrid");
        spain.setCurrency(Currency.EUR);
        spain.setPopulation(47737941);
        spain.setIsocode("ES");

        countries.put(spain.getIsocode(), spain);

        Country uk = new Country();
        uk.setName("United Kingdom of Great Britain and Northern Ireland");
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