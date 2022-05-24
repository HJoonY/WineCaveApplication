package LV.tsi.Wine_Cave.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.*;

import java.util.Collection;

import static javax.persistence.FetchType.LAZY;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Wine")
public class Wine {

    @Id
    @GeneratedValue
    Long wine_id;

    @JsonProperty
    Long user_id;

    @JsonProperty
    String Wine_name;


    @JsonProperty
    String wine_type ;

    @JsonProperty
    String wine_Color;

    @JsonProperty
    int wine_Millesime;

    @JsonProperty
    String wine_Region;

}
