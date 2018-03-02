package jukebox;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CD {
	
	private int id;
	private int numOfSongs;
	private Map<Integer, Song> songMap;
	
	public CD(int id, List<Song> songs) {
		this.id = id;
		
		songMap = new HashMap<>();
		for (Song song: songs) {
			songMap.put(song.getId(), song);
		}
		
		numOfSongs = songs.size();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumOfSongs() {
		return numOfSongs;
	}

	public void setNumOfSongs(int numOfSongs) {
		this.numOfSongs = numOfSongs;
	}

	public Map<Integer, Song> getSongMap() {
		return songMap;
	}

	public void setSongMap(Map<Integer, Song> songMap) {
		this.songMap = songMap;
	}
}
