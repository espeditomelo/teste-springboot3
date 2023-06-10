package com.vinciano.course.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.vinciano.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepositoryImplementation<OrderItem, Long>{
}
