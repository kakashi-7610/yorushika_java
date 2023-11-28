package com.example.yorushika.domain.repository.yorushika;

import java.util.Collection;
import java.util.Optional;

import com.example.yorushika.domain.model.Song;

public interface SongRepository {
	Optional<Song> findById(String id);

    Collection<Song> findAll();

    void create(Song song);

    boolean update(Song song);

    void delete(Song song);
}
