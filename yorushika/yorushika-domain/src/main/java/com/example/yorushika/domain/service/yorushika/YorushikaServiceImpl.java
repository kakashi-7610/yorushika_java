package com.example.yorushika.domain.service.yorushika;

import java.util.Collection;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.yorushika.domain.model.Yorushika;
import com.example.yorushika.domain.repository.yorushika.YorushikaRepository;

@Service
@Transactional
public class YorushikaServiceImpl implements YorushikaService {
	
	@Inject
	YorushikaRepository yorushikaRepository;
	
	@Override
	@Transactional(readOnly = true)
	public Collection<Yorushika> findAll(){
		return yorushikaRepository.findAll();
	}
}
