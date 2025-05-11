package dev.harpiaz.dio_restful_cloud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import dev.harpiaz.dio_restful_cloud.model.Board;

public interface BoardRepository extends JpaRepository<Board, Long> {
    

}
