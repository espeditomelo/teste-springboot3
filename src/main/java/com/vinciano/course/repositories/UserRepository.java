package com.vinciano.course.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.vinciano.course.entities.User;

public interface UserRepository extends JpaRepositoryImplementation<User, Long>{
	
	

}
