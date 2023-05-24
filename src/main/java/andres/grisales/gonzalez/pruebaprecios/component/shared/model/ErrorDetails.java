package andres.grisales.gonzalez.pruebaprecios.component.shared.model;

import lombok.Generated;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Generated
public class ErrorDetails {

    private final LocalDateTime timestamp;
    private final String message;
    private final String details;
    private final String path;

    public ErrorDetails(LocalDateTime timestamp, String message, String details, String path) {
        super();
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
        this.path = path;
    }

}
