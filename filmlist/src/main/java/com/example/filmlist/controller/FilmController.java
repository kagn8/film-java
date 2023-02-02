package com.example.filmlist.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.filmlist.repository.FilmRepository;
import com.example.filmlist.entity.Film;

import org.springframework.web.server.ResponseStatusException;

@RestController
public class FilmController {
	
	@Autowired
	private FilmRepository FilmRepo;

	public FilmController() {}
	
	@RequestMapping("/films")
	public Iterable<Film> getAll() {
		
		return FilmRepo.findAll();
	}
	
	@RequestMapping("films/{id}")
	public Film getById(@PathVariable Long id) {
		
		Optional<Film> film = FilmRepo.findById(id);
		
		if (!film.isPresent()) {
			
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "item not found");
		}
		
		return film.get();
	}
	
	public Film create(Film film) {
		
		return FilmRepo.save(film);
	}
	
	public Optional<Film> update(Long id, Film film) {
		
		Optional<Film> foundFilm = FilmRepo.findById(id);
		
		if (!foundFilm.isPresent()) {
			
			return Optional.empty();
		}
		
		foundFilm.get().setTitle(film.getTitle());
		
		FilmRepo.save(foundFilm.get());
		
		return foundFilm;
	}
	
	public Boolean delete(Long id) {
		
		Optional<Film> foundFilm = FilmRepo.findById(id);
		
		if (!foundFilm.isPresent()) {
			
			return false;
		}
		
		FilmRepo.delete(foundFilm.get());
		
		return true;
	}
}
