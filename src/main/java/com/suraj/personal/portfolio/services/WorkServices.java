package com.suraj.personal.portfolio.services;

import com.suraj.personal.portfolio.data.Education;
import com.suraj.personal.portfolio.data.WorkExperience;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public interface WorkServices {
    @GetMapping("/work-experience")
    public List<WorkExperience> getWorkExperience();

    @PutMapping(path = "/add-work-experience")
    public ResponseEntity<String> addWorkExperience(@RequestBody WorkExperience workExperience);

    @DeleteMapping(path = "/delete-experience")
    public ResponseEntity<String> deleteWorkExperience(@RequestParam Long id);
}
