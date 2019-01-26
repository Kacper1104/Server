package server;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Lista_rozwozowaRepository extends JpaRepository<Lista_rozwozowa, Integer> {
    List<Lista_rozwozowa> findAllByOrderByIDDesc();
}
