package org.example;

import org.example.Entity.CompanyVersionTwo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class CompanyController {

    @Autowired
    private Map<String, Company> companiesVersionOneMap;

    @Autowired
    private Map<String, CompanyVersionTwo> companiesVersionTwoMap;

    @GetMapping("/v1/companies/{id}")
    public ResponseEntity<Company> getCompanies(@PathVariable("id") String id) {

        if(companiesVersionOneMap.containsKey(id))
            return ResponseEntity.ok(companiesVersionOneMap.get(id));
       return new ResponseEntity<>(new Company(), HttpStatus.NOT_FOUND);
    }

    @GetMapping("/v2/companies/{id}")
    public ResponseEntity<CompanyVersionTwo> getCompaniesVersionTwo(@PathVariable("id") String id) {

        if(companiesVersionTwoMap.containsKey(id))
            return ResponseEntity.ok(companiesVersionTwoMap.get(id));
        return new ResponseEntity<>(new CompanyVersionTwo(), HttpStatus.NOT_FOUND);

    }
}
