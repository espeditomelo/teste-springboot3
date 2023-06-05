package com.vinciano.course.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.vinciano.course.entities.Order;

public interface OrderRepository extends JpaRepositoryImplementation<Order, Long>{
}
