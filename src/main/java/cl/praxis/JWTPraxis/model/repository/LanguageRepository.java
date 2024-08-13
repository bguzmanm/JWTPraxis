package cl.praxis.JWTPraxis.model.repository;

import cl.praxis.JWTPraxis.model.entities.Language;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LanguageRepository extends JpaRepository<Language, Integer> {
}
