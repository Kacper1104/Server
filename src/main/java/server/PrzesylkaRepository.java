package server;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PrzesylkaRepository extends JpaRepository<Przesylka, Integer> {

    List<Przesylka> findAllByOrderByIDDesc();
}
