package com.tobuku.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.tobuku.common.Vehicle;

public class Traveler {	
	@Autowired(required=false)
	@Qualifier("theOtherCar")
	private Vehicle car;
	private String origin;
	private String destination;
	
	public Traveler() {		
		origin = "";
		destination = "";
	}
	
	public Traveler(Vehicle car) {
		System.out.println("**** Constructor is called ****");
		this.car = car;
	}
	
	public Vehicle getCar() {
		return car;
	}

	public void setCar(Vehicle car) {
		System.out.println("**** Setter is called ****");
		this.car = car;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	public String toString() {
		return "Traveler [origin=" + origin + 
				"; destination=" + destination + "]";		
	}
	
	public void showCar() {
		System.out.println(car);
	}
	
	public void startJourney() {
		car.move();
	}

}
