package LV.tsi.Wine_Cave.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class HomeController {
    LocalDate now = LocalDate.now();

    @GetMapping("/home")
    public String hello() {
        return "Welcome to Wine Cave \n"+now;
    }
}
