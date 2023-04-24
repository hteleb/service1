package org.example;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

@RestController
public class CompanyController {

    @GetMapping("/v1/companies/{id}")
    public ResponseEntity<Company> getCompanies(@PathVariable("id") String id) {

        System.out.println(Instant.now().toString());
        Company company1 = new Company("company1", ZonedDateTime.of(2023, 4, 22, 8, 30, 20, 100, ZoneOffset.UTC).toString(),
                ZonedDateTime.of(2023, 12, 31, 8, 30, 20, 100, ZoneOffset.UTC).toString());
        return ResponseEntity.ok(company1);
    }
}
