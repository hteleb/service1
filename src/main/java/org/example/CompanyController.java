package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Map;

@RestController
public class CompanyController {

    @Autowired
    private Map<String, Company> companiesMap;
    @GetMapping("/v1/companies/{id}")
    public ResponseEntity<Company> getCompanies(@PathVariable("id") String id) {

        if(companiesMap.containsKey(id))
            return ResponseEntity.ok(companiesMap.get(id));
       return new ResponseEntity<>(new Company(), HttpStatus.NOT_FOUND);
    }
}
