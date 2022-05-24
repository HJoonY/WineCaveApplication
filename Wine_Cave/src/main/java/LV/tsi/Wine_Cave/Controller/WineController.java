package LV.tsi.Wine_Cave.Controller;

import LV.tsi.Wine_Cave.Model.Wine;
import LV.tsi.Wine_Cave.Service.WineService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class WineController {
    private final WineService wineService;

    @GetMapping("/wines")
    public ResponseEntity<List<Wine>> getAllWines() {
        return wineService.getAllWine();
    }

    @GetMapping("/wine/{id}")
    public ResponseEntity getWinesById(@PathVariable Long id) {
        return wineService.getWineById(id);
    }

    @GetMapping("/wine/user/{id}")
    public ResponseEntity getWineByUserId(@PathVariable Long id) {
        return wineService.getWineByUserId(id);
    }


    @DeleteMapping("/wine/{id}")
    public ResponseEntity deleteWineById(@PathVariable Long id) {
        wineService.deleteWine(id);
        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }
    @PostMapping("/wine")
    public ResponseEntity<Wine> addWine(@RequestBody Wine wine) {
        var saveWine = wineService.addWine(wine);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(saveWine);

    }
}
