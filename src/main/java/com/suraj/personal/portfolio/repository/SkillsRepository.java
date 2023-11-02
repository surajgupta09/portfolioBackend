package com.suraj.personal.portfolio.repository;

import com.suraj.personal.portfolio.data.Skills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillsRepository extends JpaRepository<Skills,Long> {
}
