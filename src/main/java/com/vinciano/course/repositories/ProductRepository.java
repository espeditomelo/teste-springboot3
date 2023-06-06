package com.vinciano.course.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.vinciano.course.entities.Product;

public interface ProductRepository extends JpaRepositoryImplementation<Product, Long>{
}
