package com.tobuku.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.tobuku.service.Vehicle;
import com.tobuku.service.impl.Car;

@Controller
public class VehicleController {
	
	@Autowired
    private Vehicle car;
	
	@RequestMapping("/showcar")
	public ModelAndView showCar() {
		return new ModelAndView("welcome", "message", car.toString() ); //Open the welcome.jsp and pass the message
	}
	
	@RequestMapping("/showmove")
	public ModelAndView showMove() {
		return new ModelAndView("welcome", "message", car.move()); //Open the welcome.jsp and pass the message
	
	}
}
