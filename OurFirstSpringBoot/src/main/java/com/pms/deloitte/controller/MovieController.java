package com.pms.deloitte.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pms.deloitte.dao.MovieDAO;

import com.pms.deloitte.model.Movie;

@RestController
public class MovieController {
	


		@Autowired
		MovieDAO movieDAO;
		@RequestMapping("/getMovie")
		public String getMovie() {
			
			return "getting movie";
		}
		
		@RequestMapping("/saveMovie")
		public String saveMovie() {
			Movie movie=new Movie(15,"Mission Mangal", "APJ Abdul Kalam",900);
			movieDAO.save(movie);
			return "Saving Movie successfully";
		}
}
