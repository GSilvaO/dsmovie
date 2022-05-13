package com.gsilvaospring.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gsilvaospring.dsmovie.entities.Movie;
import com.gsilvaospring.dsmovie.entities.Score;
import com.gsilvaospring.dsmovie.entities.ScorePK;
import com.gsilvaospring.dsmovie.entities.User;

public interface ScoreRepository extends JpaRepository<Score, ScorePK>{

}
