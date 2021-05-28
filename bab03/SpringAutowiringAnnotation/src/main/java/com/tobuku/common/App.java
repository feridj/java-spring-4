package com.tobuku.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tobuku.impl.Traveler;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Traveler firstTraveler = (Traveler)context.getBean("theTraveler");		
		System.out.println(firstTraveler);
		firstTraveler.showCar();
		firstTraveler.startJourney();
		
		
    }
}
