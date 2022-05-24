package LV.tsi.Wine_Cave.Controller;

import LV.tsi.Wine_Cave.Model.Notation;
import LV.tsi.Wine_Cave.Model.Wine;
import LV.tsi.Wine_Cave.Service.NotationService;
import LV.tsi.Wine_Cave.Service.WineService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class NotationController {
    private final NotationService notationService;

    @GetMapping("/notations")
    public ResponseEntity<List<Notation>> getAllNotation() {
        return notationService.getAllNotation();
    }

    @GetMapping("/notation/{id}")
    public ResponseEntity getWinesById(@PathVariable Long id) {
        return notationService.getNotationeById(id);
    }

    @GetMapping({"notation/wine/{wine_id}/user/{user_id}"})
    public ResponseEntity getNotationByUserandWine(@PathVariable("wine_id") Long wine_id,
                                                   @PathVariable("user_id") Long user_id) {
        return notationService.getNotationByUserandWine(wine_id, user_id);
    }

    @GetMapping({"/notation/user/{user_id}"})
    public ResponseEntity getNotationByUser(@PathVariable("user_id") Long user_id) {
        return notationService.getNotationByuser(user_id);
    }

    @DeleteMapping("/notation/{id}")
    public ResponseEntity deleteNotationById(@PathVariable Long id) {
        notationService.deleteNotation(id);
        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }
    @PostMapping("/notations")
    public ResponseEntity<Notation> addNotation(@RequestBody Notation notation) {
        var saveNotation = notationService.addNotation(notation);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(saveNotation);

    }
}
