package cl.praxis.JWTPraxis.model.repository;


import cl.praxis.JWTPraxis.model.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
