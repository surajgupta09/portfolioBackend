package com.suraj.personal.portfolio.services;

import com.suraj.personal.portfolio.data.Education;
import com.suraj.personal.portfolio.data.WorkExperience;
import com.suraj.personal.portfolio.repository.WorkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class WorkServicesImpl implements WorkServices{

    @Autowired
    WorkRepository repository;
    @Override
    public List<WorkExperience> getWorkExperience() {
        return repository.findAll();
    }

    @Override
    public ResponseEntity<String> addWorkExperience(WorkExperience workExperience) {
        WorkExperience result = repository.save(workExperience);
        return ResponseEntity.ok("Successfully added course to Database : "+result);
    }

    @Override
    public ResponseEntity<String> deleteWorkExperience(Long id) {
        repository.deleteById(id);
        return ResponseEntity.ok("Successfully deleted course from Database");
    }

}
