package server;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface AwizoRepository extends CrudRepository<Awizo, Integer> {
}
