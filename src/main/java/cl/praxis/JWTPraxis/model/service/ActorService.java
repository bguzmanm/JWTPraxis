package cl.praxis.JWTPraxis.model.service;

import cl.praxis.JWTPraxis.model.entities.Actor;

import java.util.List;

public interface ActorService {
  List<Actor> findAll();
  Actor findOne(int id);
  Actor create(Actor actor);
}
