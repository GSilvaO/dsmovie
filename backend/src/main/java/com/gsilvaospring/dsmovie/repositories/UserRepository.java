package com.gsilvaospring.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gsilvaospring.dsmovie.entities.Movie;
import com.gsilvaospring.dsmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	User findByEmail(String email);
}
