package org.dimigo.exception;

public class Movie {
	private String title;
	private int limitAge;
	
	public Movie(String title, int limitAge) {
		this.title=title;
		this.limitAge=limitAge;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @return the limitAge
	 */
	public int getLimitAge() {
		return limitAge;
	}
	
}
