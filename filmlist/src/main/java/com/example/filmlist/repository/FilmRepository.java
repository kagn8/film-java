package com.example.filmlist.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.filmlist.entity.Film;

@Repository
public interface FilmRepository extends CrudRepository<Film, Integer> {

}
