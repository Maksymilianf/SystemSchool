package com.schoolRegistrationSystem.dao;

import javax.transaction.Transactional;

import com.schoolRegistrationSystem.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

@Transactional
public interface CoursesDao extends JpaRepository<Course, Long> {
    
}
