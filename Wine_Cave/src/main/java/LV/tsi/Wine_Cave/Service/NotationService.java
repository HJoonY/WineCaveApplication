package LV.tsi.Wine_Cave.Service;


import LV.tsi.Wine_Cave.ErrorResponse;
import LV.tsi.Wine_Cave.Model.Notation;
import LV.tsi.Wine_Cave.Model.Wine;
import LV.tsi.Wine_Cave.Repository.NotationRepository;
import LV.tsi.Wine_Cave.Repository.WineRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class NotationService {

    private final NotationRepository notationRepository;

    /**
     * Save Notation using {@link NotationRepository}
     *
     * @param notation Notation data
     * @return saved Notation
     */
    public Notation addNotation(Notation notation) {
        return notationRepository.save(notation);
    }

    /**
     * Delete notation by notation
     *
     * @param id Notation id
     * @return deleted Notation id
     */
    public long deleteNotation(long id) {
        notationRepository.deleteById(id);
        return id;
    }

    /**
     * Get list of all Notation from database using {@link NotationRepository}
     *
     * @return list of Notations
     */
    public ResponseEntity<List<Notation>> getAllNotation() {
        return ResponseEntity.ok(notationRepository.findAll());
    }

    public ResponseEntity<Object> getNotationeById(long id) {
        var notation = notationRepository.findById(id);

        if (notation.isPresent()) {
            return ResponseEntity.ok(notation.get());
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

    public ResponseEntity<Object> getNotationByUserandWine(Long wine_id,Long user_id) {
        var notation = notationRepository.findByUserandWine(wine_id,user_id);
            return  ResponseEntity.ok(notation);
        }
    public ResponseEntity<Object> getNotationByuser (Long user_id) {
        var notation2 = notationRepository.findByUser(user_id);
        return  ResponseEntity.ok(notation2);
    }
    }
