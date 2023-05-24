package andres.grisales.gonzalez.pruebaprecios.config;

import andres.grisales.gonzalez.pruebaprecios.component.shared.model.ErrorDetails;
import andres.grisales.gonzalez.pruebaprecios.component.shared.web.exception.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.NativeWebRequest;

import java.time.LocalDateTime;

@RestControllerAdvice
public class WebExceptionHandler {

    private static final String RESOURCE_NOT_FOUND = "Resource not found";


    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<ErrorDetails> handleConstraintViolation(NotFoundException ex,
                                                                  NativeWebRequest request) {
        return new ResponseEntity<>(
                new ErrorDetails(LocalDateTime.now(), RESOURCE_NOT_FOUND, ex.getMessage(), request.getDescription(false)),
                HttpStatus.NOT_FOUND);
    }
}
