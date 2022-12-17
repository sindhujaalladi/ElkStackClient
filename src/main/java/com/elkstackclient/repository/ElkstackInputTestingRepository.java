package com.elkstackclient.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.elkstackclient.entity.ElkstackInputTesting;


@Repository
public interface ElkstackInputTestingRepository extends JpaRepository<ElkstackInputTesting,Integer>{
	
	ElkstackInputTesting findByid(int id);
}
