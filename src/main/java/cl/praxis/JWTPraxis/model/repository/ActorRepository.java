package cl.praxis.JWTPraxis.model.repository;


import cl.praxis.JWTPraxis.model.entities.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActorRepository extends JpaRepository<Actor, Integer> {
}
