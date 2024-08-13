package cl.praxis.JWTPraxis.controller;

import cl.praxis.JWTPraxis.model.entities.Actor;
import cl.praxis.JWTPraxis.model.service.ActorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/actors")
public class ActorRestController {
  private final ActorService service;

  public ActorRestController(ActorService service) {
    this.service = service;
  }
  private HttpStatus status = HttpStatus.OK;

  @GetMapping
  public List<Actor> findAll(){
    return service.findAll();
  }

  @GetMapping("/{id}")
  public ResponseEntity<Actor> findOne(@PathVariable("id") int id){

    Actor actor = service.findOne(id);

    if (actor == null){
      status = HttpStatus.NOT_FOUND;
    }

    return new ResponseEntity<>(actor, status);
  }

  @PostMapping
  public ResponseEntity<Actor> create(@RequestBody Actor actor){
    Actor actorCreated = service.create(actor);

    if (actorCreated == null){
      status = HttpStatus.CONFLICT;
    } else {
      status = HttpStatus.CREATED;
    }

    return new ResponseEntity<>(actorCreated, status);
  }
}
