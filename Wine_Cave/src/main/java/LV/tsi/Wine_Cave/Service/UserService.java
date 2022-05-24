package LV.tsi.Wine_Cave.Service;

import LV.tsi.Wine_Cave.ErrorResponse;
import LV.tsi.Wine_Cave.Model.User;
import LV.tsi.Wine_Cave.Repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserService {
    @Autowired
    UserRepository userRepository;

    /**
     * Save employee using {@link UserRepository}
     * @param user User data
     * @return saved User
     */
    public User addUser(User user) {
        return userRepository.save(user);
    }

    /**
     * Delete user by user_id
     * @param id user id
     * @return deleted user id
     */
    public long deleteUser(long id) {
        userRepository.deleteById(id);
        return id;
    }

    /**
     * Get list of all User from database using {@link UserRepository}
     *
     * @return list of User
     */
    public ResponseEntity<List<User>> getUsers() {
        return ResponseEntity.ok(userRepository.findAll());
    }

    /**
     * Get employee by id using {@link UserRepository}
     *
     * @param id Employee ID
     * @return Employee
     */
    public ResponseEntity<Object> getUserById(long id) {
        var user = userRepository.findById(id);

        if(user.isPresent()) {
            return ResponseEntity.ok(user.get());
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(
                            ErrorResponse.builder()
                                    .errorCode("User_NOT_FOUND")
                                    .errorMessage("User does not exist with id:" + id)
                                    .referenceId(UUID.randomUUID().toString())
                                    .build()
                    );
        }
    }

}
