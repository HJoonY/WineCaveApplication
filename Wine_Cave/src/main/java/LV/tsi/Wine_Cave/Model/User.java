package LV.tsi.Wine_Cave.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.springframework.http.ResponseEntity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "User")
public class User {

    @Id
    @GeneratedValue
    Long User_id;

    @JsonProperty
    String User_Fname;

    @JsonProperty
    String User_Lname;

    @JsonProperty
    String User_Email;

    @JsonProperty
    String User_PassWord;


}
