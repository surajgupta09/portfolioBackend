package com.suraj.personal.portfolio.repository;

import com.suraj.personal.portfolio.data.Education;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EducationRepository extends JpaRepository<Education,Long> {

    List<Education> findAll();

}
