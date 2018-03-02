package jukebox;

public class Song {
	
	private int id;
	private String title;
	private String artist;
	private double length;
	private String genre;
	private CD cd;
	
	public Song(int id, String title, String artist, double length, String genre, CD cd) {
		this.id = id;
		this.title = title;
		this.artist = artist;
		this.length = length;
		this.genre = genre;
		this.cd = cd;
	}

	// getter and setter
	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public CD getCd() {
		return cd;
	}

	public void setCd(CD cd) {
		this.cd = cd;
	}
}
