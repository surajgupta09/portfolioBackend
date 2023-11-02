package com.suraj.personal.portfolio.repository;

import com.suraj.personal.portfolio.data.WorkExperience;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkRepository extends JpaRepository<WorkExperience, Long> {

}
