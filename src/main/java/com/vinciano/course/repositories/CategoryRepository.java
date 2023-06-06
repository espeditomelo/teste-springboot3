package com.vinciano.course.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.vinciano.course.entities.Category;

public interface CategoryRepository extends JpaRepositoryImplementation<Category, Long>{
}
