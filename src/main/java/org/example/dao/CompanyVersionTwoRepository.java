package org.example.dao;

import org.example.Entity.Company;
import org.example.Entity.CompanyVersionTwo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class CompanyVersionTwoRepository {

    @Bean

    public Map<String, CompanyVersionTwo> companiesVersionTwoMap() {
        Map<String, CompanyVersionTwo> companiesMap = new HashMap<>();

        companiesMap.put("1", CompanyVersionTwo.builder()
                .companyName("Company1")
                .taxIdentificationNumber("100")
                .dissolvedOn(ZonedDateTime.of(2023, 12, 31, 8, 30, 20, 100, ZoneOffset.UTC).toString())
                .build());
        companiesMap.put("2", CompanyVersionTwo.builder()
                .companyName("Company2")
                .taxIdentificationNumber("101")
                .dissolvedOn(ZonedDateTime.of(2024, 01, 01, 10, 32, 20, 100, ZoneOffset.UTC).toString())
                .build());
        companiesMap.put("3", CompanyVersionTwo.builder()
                .companyName("Company3")
                .taxIdentificationNumber("104")
                .dissolvedOn(ZonedDateTime.of(2024, 2, 26, 12, 50, 20, 100, ZoneOffset.UTC).toString())
                .build());
        companiesMap.put("4", CompanyVersionTwo.builder()
                .companyName("Company4")
                .taxIdentificationNumber("106")
                .dissolvedOn(ZonedDateTime.of(2023, 12, 31, 12, 46, 20, 100, ZoneOffset.UTC).toString())
                .build());
        companiesMap.put("5", CompanyVersionTwo.builder()
                .companyName("Company5")
                .taxIdentificationNumber("108")
                .dissolvedOn(ZonedDateTime.of(2024, 12, 31, 6, 22, 20, 100, ZoneOffset.UTC).toString())
                .build());
        companiesMap.put("6", CompanyVersionTwo.builder()
                .companyName("Company6")
                .taxIdentificationNumber("110")
                .dissolvedOn(ZonedDateTime.of(2024, 1, 30, 8, 44, 20, 100, ZoneOffset.UTC).toString())
                .build());
        companiesMap.put("7", CompanyVersionTwo.builder()
                .companyName("Company7")
                .taxIdentificationNumber("112")
                .dissolvedOn(ZonedDateTime.of(2024, 10, 20, 10, 25, 20, 100, ZoneOffset.UTC).toString())
                .build());
        companiesMap.put("8", CompanyVersionTwo.builder()
                .companyName("Company8")
                .taxIdentificationNumber("114")
                .dissolvedOn(ZonedDateTime.of(2024, 3, 27, 7, 30, 20, 100, ZoneOffset.UTC).toString())
                .build());
        companiesMap.put("9", CompanyVersionTwo.builder()
                .companyName("Company9")
                .taxIdentificationNumber("116")
                .dissolvedOn(ZonedDateTime.of(2024, 4, 28, 10, 30, 20, 100, ZoneOffset.UTC).toString())
                .build());
        companiesMap.put("10", CompanyVersionTwo.builder()
                .companyName("Company10")
                .taxIdentificationNumber("118")
                .dissolvedOn(ZonedDateTime.of(2024, 06, 18, 10, 26, 20, 100, ZoneOffset.UTC).toString())
                .build());
        return companiesMap;
    }
}
