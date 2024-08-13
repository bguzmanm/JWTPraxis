package cl.praxis.JWTPraxis.model.repository;


import cl.praxis.JWTPraxis.model.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Integer> {
}
