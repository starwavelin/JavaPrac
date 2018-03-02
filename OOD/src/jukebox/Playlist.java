package jukebox;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author xianlin
 *
 * Playlist loads/contains songs using a queued up songList
 */
public class Playlist {
	
	private Queue<Song> songList;
	
	public Playlist() {
		songList = new LinkedList<>();
	}
	
	public void addSong(Song song) {
		songList.offer(song);
	}
	
	public void removeSong(Song song) {
		if (!songList.contains(song)) {
			throw new IllegalStateException("The song you wanna remove is not in the playlist!");
		}
		songList.remove(song);
	}
	
	public Song pollSong() {
		return songList.poll();
	}
	
	public Song getNextSong() {
		return songList.peek();
	}
}
