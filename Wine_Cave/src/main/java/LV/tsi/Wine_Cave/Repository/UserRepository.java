package LV.tsi.Wine_Cave.Repository;

import LV.tsi.Wine_Cave.Model.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface UserRepository extends JpaRepository<User,Long> {

}