package com.startup.practice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private Integer locId;
	public Integer getLocId() {
		return locId;
	}
	public void setLocId(Integer locId) {
		this.locId = locId;
	}
	public Integer getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Name" + name + ", Id =" + id;
	}
	public UserEntity(String name, Integer locId) {
		this.name = name;
		this.locId = locId;
	}
	public UserEntity() {
		super();
	}

}
