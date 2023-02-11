package com.startup.practice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LocationEntity {

	public LocationEntity(String location) {
		this.location = location;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer locId;
	private String location;
	public Integer getLocId() {
		return locId;
	}
	public LocationEntity() {
		super();
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
}
