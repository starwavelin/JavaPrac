package jukebox;

import java.util.List;

/**
 * Equivalent to the Runner class
 */
public class Jukebox {
	
	private CDLibrary library;
	private Player player;
	private Playlist list;
	
	public Jukebox(List<CD> cds) {
		library = new CDLibrary(cds);
		player = new Player();
		list = new Playlist();
	}
	
	// logic to load songs from library to list
	
	
	
	// logic to let player play the songs from the list
	
}
