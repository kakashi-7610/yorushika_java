package com.example.yorushika.domain.repository.yorushika;

import java.util.Collection;
import java.util.Optional;

import com.example.yorushika.domain.model.Sanctuary;

public interface SanctuaryRepository {
	Optional<Sanctuary> findById(String id);

    Collection<Sanctuary> findAll();

    void create(Sanctuary sanctuary);

    boolean update(Sanctuary sanctuary);

    void delete(Sanctuary sanctuary);
}
