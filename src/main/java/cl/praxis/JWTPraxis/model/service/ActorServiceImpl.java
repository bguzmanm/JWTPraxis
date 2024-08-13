package cl.praxis.JWTPraxis.model.service;


import cl.praxis.JWTPraxis.model.entities.Actor;
import cl.praxis.JWTPraxis.model.repository.ActorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActorServiceImpl implements ActorService {

  private final ActorRepository repository;

  public ActorServiceImpl(ActorRepository repository) {
    this.repository = repository;
  }

  @Override
  public List<Actor> findAll() {
    return repository.findAll();
  }

  @Override
  public Actor findOne(int id) {
    return repository.findById(id).orElse(null);
  }

  @Override
  public Actor create(Actor actor) {
    return repository.save(actor);
  }
}
