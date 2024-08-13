package cl.praxis.JWTPraxis.controller;

import cl.praxis.JWTPraxis.model.entities.Film;
import cl.praxis.JWTPraxis.model.service.FilmService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/films")
public class FilmRestController {
  private final FilmService service;

  public FilmRestController(FilmService service) {
    this.service = service;
  }

  private HttpStatus status = HttpStatus.OK;

  @GetMapping
  public ResponseEntity<List<Film>> findAll(){
    List<Film> films = service.findAll();

    if (films == null || films.size() == 0){
      status = HttpStatus.NOT_FOUND;
    }

    return new ResponseEntity<>(films, status);
  }

  @GetMapping("/{id}")
  public ResponseEntity<Film> findOne(@PathVariable("id") int id){
    Film film = service.findOne(id);

    if (film == null){
      status = HttpStatus.NOT_FOUND;
    }

    return new ResponseEntity<>(film, status);
  }
}
