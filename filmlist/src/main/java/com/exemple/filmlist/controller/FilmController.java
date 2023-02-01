package com.exemple.filmlist.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.filmlist.repository.FilmRepository;
import com.exemple.filmlist.models.Film;

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
	public Film getById(@PathVariable int id) {
		
		Optional<Film> film = FilmRepo.findById(id);
		
		if (film.isEmpty()) {
			
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "item not found");
		}
		
		return film.get();
	}
	
	public Film create(Film film) {
		
		return FilmRepo.save(film);
	}
	
	public Optional<Film> update(int id, Film film) {
		
		Optional<Film> foundFilm = FilmRepo.findById(id);
		
		if (foundFilm.isEmpty()) {
			
			return Optional.empty();
		}
		
		foundFilm.get().setTitle(film.getTitle());
		
		FilmRepo.save(foundFilm.get());
		
		return foundFilm;
	}
	
	public Boolean delete(int id) {
		
		Optional<Film> foundFilm = FilmRepo.findById(id);
		
		if (foundFilm.isEmpty()) {
			
			return false;
		}
		
		FilmRepo.delete(foundFilm.get());
		
		return true;
	}
}
