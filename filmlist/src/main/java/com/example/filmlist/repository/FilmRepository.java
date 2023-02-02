package com.example.filmlist.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.exemple.filmlist.models.Film;

@Repository
public interface FilmRepository extends CrudRepository<Film, Integer> {

}
