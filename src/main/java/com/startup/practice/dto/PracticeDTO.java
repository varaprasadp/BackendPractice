package com.startup.practice.dto;

public class PracticeDTO {
	public PracticeDTO(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}
	private String name;
	private String location;
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "PracticeDTO [location=" + location + ", name=" + name + "]";
	}
	
}
