package com.suraj.personal.portfolio.services;

import com.suraj.personal.portfolio.data.Skills;
import com.suraj.personal.portfolio.repository.SkillsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SkillServicesImpl implements SkillServices{
    @Autowired
    private SkillsRepository repository;
    @Override
    public List<Skills> getSkills() {
        return repository.findAll();
    }

    @Override
    public ResponseEntity<String> addSkill(Skills skills) {
        Skills result = repository.save(skills);
        return ResponseEntity.ok("Successfully added skill to database : "+result);
    }

    @Override
    public ResponseEntity<String> deleteSkill(Long id) {
        repository.deleteById(id);
        return ResponseEntity.ok("Successfully deleted skill from database");
    }
}
