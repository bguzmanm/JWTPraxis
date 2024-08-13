package cl.praxis.JWTPraxis.model.repository;


import cl.praxis.JWTPraxis.model.entities.Film;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmRepository extends JpaRepository<Film, Integer> {}
