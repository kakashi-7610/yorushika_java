package com.example.yorushika.domain.service.yorushika;

import java.util.Collection;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.yorushika.domain.model.Sanctuary;
import com.example.yorushika.domain.repository.yorushika.SanctuaryRepository;

@Service
@Transactional
public class SanctuaryServiceImpl implements SanctuaryService {

	@Inject
	SanctuaryRepository sanctuaryRepository;

	@Override
	@Transactional(readOnly = true)
	public Collection<Sanctuary> findAllSanctuary() {
		return sanctuaryRepository.findAll();
	}

}
