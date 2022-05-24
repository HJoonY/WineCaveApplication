package LV.tsi.Wine_Cave.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Notation")
public class Notation {
    @Id
    @GeneratedValue
    Long Notation_id;

    @JsonProperty
    Long wine_id;

    @JsonProperty
    Long user_id;

    @JsonProperty
    String Notation_date;

    @JsonProperty
    String Notation_Smell;

    @JsonProperty
    String Notation_Taste;

    @JsonProperty
    int Notation_Note;

}
