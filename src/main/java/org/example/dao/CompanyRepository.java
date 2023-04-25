package org.example.dao;

import org.example.Company;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class CompanyRepository {

    @Bean
    public Map<String, Company> companiesMap() {
        Map<String, Company> companiesMap = new HashMap<>();

        companiesMap.put("1", Company.builder()
                .cn("Company1")
                .createdOn(ZonedDateTime.of(2023, 4, 22, 8, 30, 20, 100, ZoneOffset.UTC).toString())
                .closedOn(ZonedDateTime.of(2023, 12, 31, 8, 30, 20, 100, ZoneOffset.UTC).toString())
                .build());
        companiesMap.put("2", Company.builder()
                .cn("Company2")
                .createdOn(ZonedDateTime.of(2023, 3, 20, 9, 28, 20, 100, ZoneOffset.UTC).toString())
                .closedOn(ZonedDateTime.of(2024, 01, 01, 10, 32, 20, 100, ZoneOffset.UTC).toString())
                .build());
        companiesMap.put("3", Company.builder()
                .cn("Company3")
                .createdOn(ZonedDateTime.of(2023, 2, 02, 10, 58, 20, 100, ZoneOffset.UTC).toString())
                .closedOn(ZonedDateTime.of(2024, 2, 26, 12, 50, 20, 100, ZoneOffset.UTC).toString())
                .build());
        companiesMap.put("4", Company.builder()
                .cn("Company4")
                .createdOn(ZonedDateTime.of(2023, 01, 24, 6, 26, 20, 100, ZoneOffset.UTC).toString())
                .closedOn(ZonedDateTime.of(2023, 12, 31, 12, 46, 20, 100, ZoneOffset.UTC).toString())
                .build());
        companiesMap.put("5", Company.builder()
                .cn("Company5")
                .createdOn(ZonedDateTime.of(2023, 4, 20, 5, 20, 20, 100, ZoneOffset.UTC).toString())
                .closedOn(ZonedDateTime.of(2024, 12, 31, 6, 22, 20, 100, ZoneOffset.UTC).toString())
                .build());
        companiesMap.put("6", Company.builder()
                .cn("Company6")
                .createdOn(ZonedDateTime.of(2023, 3, 18, 2, 28, 20, 100, ZoneOffset.UTC).toString())
                .closedOn(ZonedDateTime.of(2024, 1, 30, 8, 44, 20, 100, ZoneOffset.UTC).toString())
                .build());
        companiesMap.put("7", Company.builder()
                .cn("Company7")
                .createdOn(ZonedDateTime.of(2023, 4, 10, 8, 30, 20, 100, ZoneOffset.UTC).toString())
                .closedOn(ZonedDateTime.of(2024, 10, 20, 10, 25, 20, 100, ZoneOffset.UTC).toString())
                .build());
        companiesMap.put("8", Company.builder()
                .cn("Company8")
                .createdOn(ZonedDateTime.of(2023, 2, 22, 6, 30, 20, 100, ZoneOffset.UTC).toString())
                .closedOn(ZonedDateTime.of(2024, 3, 27, 7, 30, 20, 100, ZoneOffset.UTC).toString())
                .build());
        companiesMap.put("9", Company.builder()
                .cn("Company9")
                .createdOn(ZonedDateTime.of(2023, 3, 12, 3, 30, 20, 100, ZoneOffset.UTC).toString())
                .closedOn(ZonedDateTime.of(2024, 4, 28, 10, 30, 20, 100, ZoneOffset.UTC).toString())
                .build());
        companiesMap.put("10", Company.builder()
                .cn("Company10")
                .createdOn(ZonedDateTime.of(2023, 1, 10, 4, 46, 20, 100, ZoneOffset.UTC).toString())
                .closedOn(ZonedDateTime.of(2024, 06, 18, 10, 26, 20, 100, ZoneOffset.UTC).toString())
                .build());
        return companiesMap;
    }

}
