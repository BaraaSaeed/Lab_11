import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Copyright (c) 2019. This program and the accompanying materials are made
 * available under my granted permission provided that this note is kept intact,
 * unmodified and unchanged. @ Author: Baraa Ali - API and implementation. All
 * rights reserved.
 */

public class MovieApp {
	static Scanner scnr = new Scanner(System.in);

	public static void main(String[] args) {
		char wannaContinue = 'y';
		ArrayList<Movie> movies = new ArrayList<Movie>();
		buildAndDisplayMovieList(movies);
		do {
			int userChoice = getUserInput();
			printRequestedCategory(movies, userChoice);
			System.out.println("Continue? (y/n)");

			wannaContinue = scnr.next().charAt(0);
			scnr.nextLine();
		} while (wannaContinue == 'y');

		System.out.println("Goodbye!");
	}

	public static void buildAndDisplayMovieList(ArrayList<Movie> movies) {
		System.out.println("Welcome to the Movie List Application!\n");
		System.out.println("There are 100 movies in this list.");
		for (int i = 0; i < 100; i++) {
			movies.add(MovieIO.getMovie(i + 1));
		}

	}

	public static int getUserInput() {

		String[] categoryList = { "animated", "drama", "horror", "scifi", "musical", "comedy" };
		for (int i = 0; i < categoryList.length; i++) {
			System.out.println(i + 1 + "." + categoryList[i]);
		}
		System.out.println("what category are you interested in? Enter a number:");

		int userChoice = scnr.nextInt();
		scnr.nextLine();
		return userChoice;
	}

	public static void printRequestedCategory(ArrayList<Movie> movies, int userChoice) {
		ArrayList<String> sortedMovies = new ArrayList<String>();
		if (userChoice == 1) {
			for (Movie movie : movies) {
				if (movie.getMoviecCategory().equals("animated")) {
					sortedMovies.add(movie.getMovieTitle());
				}
			}
		} else if (userChoice == 2) {
			for (Movie movie : movies) {
				if (movie.getMoviecCategory().equals("drama")) {
					sortedMovies.add(movie.getMovieTitle());
				}
			}
		} else if (userChoice == 3) {
			for (Movie movie : movies) {
				if (movie.getMoviecCategory().equals("horror")) {
					sortedMovies.add(movie.getMovieTitle());
				}
			}
		} else if (userChoice == 4) {
			for (Movie movie : movies) {
				if (movie.getMoviecCategory().equals("scifi")) {
					sortedMovies.add(movie.getMovieTitle());
				}
			}
		} else if (userChoice == 5) {
			for (Movie movie : movies) {
				if (movie.getMoviecCategory().equals("musical")) {
					sortedMovies.add(movie.getMovieTitle());
				}
			}
		} else if (userChoice == 6) {
			for (Movie movie : movies) {
				if (movie.getMoviecCategory().equals("comedy")) {
					sortedMovies.add(movie.getMovieTitle());
				}
			}
		}
		Collections.sort(sortedMovies);
		for (String title : sortedMovies)
			System.out.println(title);
	}
}
