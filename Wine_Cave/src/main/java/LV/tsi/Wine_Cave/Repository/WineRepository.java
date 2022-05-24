package LV.tsi.Wine_Cave.Repository;

import LV.tsi.Wine_Cave.Model.User;
import LV.tsi.Wine_Cave.Model.Wine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface WineRepository extends JpaRepository<Wine,Long> {

    @Query(value = "SELECT * FROM Wine WHERE user_id = ?1", nativeQuery = true)
    List<Wine> findByUser_Id(Long user_id);
}
