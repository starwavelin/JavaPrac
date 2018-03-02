package jukebox;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CDLibrary {
	
	private Map<Integer, CD> cdMap;
	
	public CDLibrary(List<CD> cdList) {
		cdMap = new HashMap<>();
		for (CD cd : cdList) {
			cdMap.put(cd.getId(), cd);
		}
	}
	
	public boolean searchCD(CD cd) {
		return cdMap.containsKey(cd.getId());
	}
	
	public boolean searchSong(Song song) {
		return searchCD(song.getCd());
	}
	
	public void addCD(CD cd) {
		if (!cdMap.containsKey(cd.getId()))
			cdMap.put(cd.getId(), cd);
	}
	
	public void removeCD(CD cd) {
		if (cdMap.containsKey(cd.getId())) {
			cdMap.remove(cd.getId());
		}
	}
	
}
