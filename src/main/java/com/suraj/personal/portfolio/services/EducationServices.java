package com.suraj.personal.portfolio.services;

import com.suraj.personal.portfolio.data.Education;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public interface EducationServices {

    @GetMapping("/education-details")
    public List<Education> getEducationDetails();

    @PutMapping(path = "/add-education")
    public ResponseEntity<String> addEducation(@RequestBody Education education);

    @DeleteMapping(path = "/delete-education")
    public ResponseEntity<String> deleteEducation(@RequestParam Long id);
}
