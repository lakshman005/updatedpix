package com.revature.pixott.Model;

public class Watchlist {
	private String Movies;
	private int no;
	
	public Watchlist() {
		
	}

	public Watchlist(String movies, int no) {
		super();
		Movies = movies;
		this.no = no;
	}

	public String getMovies() {
		return Movies;
	}

	public void setMovies(String movies) {
		Movies = movies;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Movies == null) ? 0 : Movies.hashCode());
		result = prime * result + no;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Watchlist other = (Watchlist) obj;
		if (Movies == null) {
			if (other.Movies != null)
				return false;
		} else if (!Movies.equals(other.Movies))
			return false;
		if (no != other.no)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return String.format("%d %s",no,Movies);
	}

	
	
	

}
