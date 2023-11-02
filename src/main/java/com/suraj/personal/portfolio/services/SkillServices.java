package com.suraj.personal.portfolio.services;

import com.suraj.personal.portfolio.data.Skills;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public interface SkillServices {

    @GetMapping("/get-skills")
    public List<Skills> getSkills();

    @PutMapping(path = "/add-skill")
    public ResponseEntity<String> addSkill(@RequestBody Skills skills);

    @DeleteMapping(path = "/delete-skill", params = "id")
    public ResponseEntity<String> deleteSkill(@RequestParam Long id);
}
