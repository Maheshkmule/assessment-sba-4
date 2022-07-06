package com.springbootapicricket.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootapicricket.entity.Player;



public interface PlayerRepository extends JpaRepository<Player,Integer>{

}
