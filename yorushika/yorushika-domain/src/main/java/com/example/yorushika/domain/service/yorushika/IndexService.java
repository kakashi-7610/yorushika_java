package com.example.yorushika.domain.service.yorushika;

import java.util.Collection;

import com.example.yorushika.domain.model.Song;

public interface IndexService {
	Collection<Song> findAllSong();
	
}
