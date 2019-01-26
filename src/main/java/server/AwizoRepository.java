package server;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AwizoRepository extends JpaRepository<Awizo, Integer> {
    List<Awizo> findAllByOrderByIDDesc();
}
