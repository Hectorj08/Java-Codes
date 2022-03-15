

public class Movie {
	private String movieName;
	private int numMinutes;
	private boolean isKidFriendly;
	private int numCastMembers;
	private String [] castMembers;

	public Movie() {
		movieName = "Flick";
		numMinutes = 0;
		isKidFriendly = false;
		numCastMembers = 0;
		castMembers = new String[10];
	}
	public Movie(String movieName, int numMinutes, boolean isKidFriendly, String[] castMembers) {
		this.movieName = movieName;
		this.numMinutes = numMinutes;
		this.isKidFriendly = isKidFriendly;
		this.numCastMembers = castMembers.length;
		this.castMembers = castMembers;

		for(int i = 0; i < castMembers.length;i++) {
			this.castMembers[i] = castMembers[i];
		}
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public void setNumMinutes(int numMinutes) {
		this.numMinutes = numMinutes;
	}
	public void setIsKidFriendly(boolean isKidFriendly) {
		this.isKidFriendly = isKidFriendly;
	}
	public String getMovieName() {
		return movieName;
	}
	public int getNumMinutes() {
		return numMinutes;
	}
	public boolean isKidFriendly() {
		return isKidFriendly;
	}
	public int getNumCastMembers() {
		return numCastMembers;
	}
	public String [] getCastMembers() {
		return this.castMembers.clone();
	}
	public boolean replaceCastMember(int index, String castMemberName) {
		if(index < 0 || index >= numCastMembers)
			return false;
		castMembers[index] = castMemberName;
		return true;
	}
	public boolean doArraysMatch(String [] arr1, String [] arr2) {
		if(arr1 == null && arr2 == null) {
			return true;
		}
		else if(arr1 == null || arr2 == null) {
			return false;
		}
		else if(arr1.length != arr2.length) {
			return false;     
		}
		for(int i = 0; i < arr1.length;i++) {
			if(!arr1[i].equalsIgnoreCase(arr2[i])) 
				return false;
		}
		return true;
	}
	public String getCastMemberNamesAsString() {
		if (numCastMembers == 0)
			return "none";
		String castMemberNames = castMembers[0];
		for (int i = 1; i < numCastMembers; i++) {
			castMemberNames += ", " + castMembers[i];
		}
		return castMemberNames;
	}
	public String toString() {
		  String movieData = "Movie: [ Minutes " + String.format("%03d", numMinutes) + " | Movie Name: %20s |";
	        if (isKidFriendly)
	            movieData += " is kid friendly |";
	        else
	            movieData += " not kid friendly |";
	        movieData += " Number of Cast Members: " + numCastMembers + " | Cast Members: " + getCastMemberNamesAsString()
	                + " ]";
	        return String.format(movieData, movieName);
	}
	public boolean equals(Object o) {
		if(o instanceof Movie) {
			Movie film = (Movie) o;
			return((movieName.equalsIgnoreCase(film.movieName)) && (isKidFriendly == film.isKidFriendly) && (numMinutes == film.numMinutes)
					&& (numCastMembers == film.numCastMembers) && (doArraysMatch(castMembers,film.castMembers)));
		}
		return false;
	}
}


