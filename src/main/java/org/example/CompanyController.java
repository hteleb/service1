package org.example;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompanyController {

    @GetMapping("/v1/companies/{id}")
    public ResponseEntity<Company> getCompanies(@PathVariable("id") String id) {

        Company company1 = new Company("company1", "04/22/2023", "12/01/2023");
        return ResponseEntity.ok(company1);
    }
}
