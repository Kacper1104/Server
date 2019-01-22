package server;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface PrzesylkaRepository extends JpaRepository<Przesylka, Integer> {
}
