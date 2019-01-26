package server;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface NadawcaRepository extends JpaRepository<Nadawca, Integer> {
    List<Nadawca> findAllByOrderByIDDesc();
}
