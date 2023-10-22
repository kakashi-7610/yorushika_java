package com.example.yorushika.domain.repository.yorushika;

import java.util.Collection;
import java.util.Optional;

import com.example.yorushika.domain.model.Yorushika;

public interface YorushikaRepository {
	Optional<Yorushika> findById(String id);

    Collection<Yorushika> findAll();

    void create(Yorushika yorushika);

    boolean update(Yorushika yorushika);

    void delete(Yorushika yorushika);
}
