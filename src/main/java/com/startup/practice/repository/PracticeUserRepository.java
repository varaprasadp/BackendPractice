package com.startup.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.startup.practice.entity.UserEntity;


public interface PracticeUserRepository extends JpaRepository<UserEntity, Integer>{

}
