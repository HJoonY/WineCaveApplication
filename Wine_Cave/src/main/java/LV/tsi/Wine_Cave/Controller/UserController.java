package LV.tsi.Wine_Cave.Controller;

import LV.tsi.Wine_Cave.Model.User;
import LV.tsi.Wine_Cave.Service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class UserController {
    @Autowired
    UserService userService;


    @GetMapping("/users")
    public ResponseEntity<List<User>> getAllUser() {
        return userService.getUsers();
   }

    @GetMapping("/user/{id}")
    public ResponseEntity getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @DeleteMapping("/user/{id}")
    public ResponseEntity deleteUserById(@PathVariable Long id) {
        userService.deleteUser(id);
        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }
    @PostMapping("/users")
    public ResponseEntity<User> addEmployee(@RequestBody User user) {
        var saveUser = userService.addUser(user);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(saveUser);

    }






}
