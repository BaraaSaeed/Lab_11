/**
 * Copyright (c) 2019. This program and the accompanying materials are made
 * available under my granted permission provided that this note is kept intact,
 * unmodified and unchanged. @ Author: Baraa Ali - API and implementation. All
 * rights reserved.
 */

public class Movie {
	private String title;
	private String category;

	public Movie(String title, String category) {
		this.title = title;
		this.category = category;
	}

	public void setMovieTitle(String title) {
		this.title = title;
	}

	public void setMovieCategory(String category) {
		this.category = category;
	}

	public String getMovieTitle() {
		return title;
	}

	public String getMoviecCategory() {
		return category;
	}

}
