package com.revature.pixott.handler;

import java.util.List;

import com.revature.pixott.Dao.Moviedao;
import com.revature.pixott.Model.Movie;

public class MovieHandler {
	
	public static void displayMovie() {
		Moviedao dao = new Moviedao();
		List<Movie> movies = dao.findAll();
		System.out.println("movies");
		System.out.println();
		System.out.printf("%4s %-40s\n", "Id", "Name");
		System.out.printf("%4s %-40s\n", "==", "====");
		movies.forEach(System.out::println);
		System.out.println();
		MainMenuHandler.dis();
	}

}
