package com.suraj.personal.portfolio.services;

import com.suraj.personal.portfolio.data.Education;
import com.suraj.personal.portfolio.repository.EducationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EducationServicesImpl implements EducationServices{

    @Autowired
    EducationRepository repository;
    @Override
    public List<Education> getEducationDetails() {
        return repository.findAll();
    }

    @Override
    public ResponseEntity<String> addEducation(Education education) {
        Education result = repository.save(education);
        return ResponseEntity.ok("Successfully added course to Database : "+result);
    }

    @Override
    public ResponseEntity<String> deleteEducation(Long id) {
        repository.deleteById(id);
        return ResponseEntity.ok("Successfully deleted course from Database");
    }

}
