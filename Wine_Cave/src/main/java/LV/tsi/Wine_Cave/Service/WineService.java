package LV.tsi.Wine_Cave.Service;


import LV.tsi.Wine_Cave.ErrorResponse;
import LV.tsi.Wine_Cave.Model.User;
import LV.tsi.Wine_Cave.Model.Wine;
import LV.tsi.Wine_Cave.Repository.WineRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.groupingByConcurrent;

@Service
@RequiredArgsConstructor
public class WineService {

    private final WineRepository wineRepository;

    /**
     * Save employee using {@link WineRepository}
     *
     * @param wine Wine data
     * @return saved Wine
     */
    public Wine addWine(Wine wine) {
        return wineRepository.save(wine);
    }

    /**
     * Delete wine by wine_id
     *
     * @param id wine id
     * @return deleted wine id
     */
    public long deleteWine(long id) {
        wineRepository.deleteById(id);
        return id;
    }

    /**
     * Get list of all wine from database using {@link WineRepository}
     *
     * @return list of wine
     */
    public ResponseEntity<List<Wine>> getAllWine() {
        return ResponseEntity.ok(wineRepository.findAll());
    }

    public ResponseEntity<Object> getWineById(long id) {
        var wine = wineRepository.findById(id);

        if (wine.isPresent()) {
            return ResponseEntity.ok(wine.get());
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(
                            ErrorResponse.builder()
                                    .errorCode("Wine_NOT_FOUND")
                                    .errorMessage("Wine does not exist with id:" + id)
                                    .referenceId(UUID.randomUUID().toString())
                                    .build()
                    );
        }
    }

    public ResponseEntity<Object> getWineByUserId(long id) {
        var wine2 = wineRepository.findByUser_Id(id);
            return  ResponseEntity.ok(wine2);
        }
    }
