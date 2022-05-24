package LV.tsi.Wine_Cave;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class ErrorResponse {
    String errorCode;
    String errorMessage;
    String referenceId;
}
