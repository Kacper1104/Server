package server;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MagazynierRepository extends JpaRepository<Magazynier, Integer> {
    List<Magazynier> findAllByOrderByIDDesc();
}
