package server;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface OdbiorcaRepository extends JpaRepository<Odbiorca, Integer> {
    List<Odbiorca> findAllByOrderByIDDesc();
}
