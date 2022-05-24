package LV.tsi.Wine_Cave.Repository;

import LV.tsi.Wine_Cave.Model.Notation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface NotationRepository extends JpaRepository<Notation,Long> {

    @Query(value = "SELECT * FROM Notation WHERE wine_id = ?1 and user_id = ?2" , nativeQuery = true)
    List<Notation> findByUserandWine(Long wine_id,Long user_id);

    @Query(value = "SELECT * FROM Notation WHERE user_id = ?1" , nativeQuery = true)
    List<Notation> findByUser(Long user_id);
}
