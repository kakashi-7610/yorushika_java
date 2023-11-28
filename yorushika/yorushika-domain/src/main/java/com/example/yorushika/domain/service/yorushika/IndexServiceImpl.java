package com.example.yorushika.domain.service.yorushika;

import java.util.Collection;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.yorushika.domain.model.Song;
import com.example.yorushika.domain.repository.yorushika.SongRepository;

@Service
@Transactional
public class IndexServiceImpl implements IndexService {
	
	@Inject
	SongRepository songRepository;
	
	@Override
	@Transactional(readOnly = true)
	public Collection<Song> findAllSong(){
		return songRepository.findAll();
	}
}
