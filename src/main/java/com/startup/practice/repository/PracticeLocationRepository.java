package com.startup.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.startup.practice.entity.LocationEntity;

public interface PracticeLocationRepository extends JpaRepository<LocationEntity, Integer>{

}
