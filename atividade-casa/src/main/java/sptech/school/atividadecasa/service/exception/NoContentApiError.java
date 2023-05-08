package sptech.school.atividadecasa.service.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NO_CONTENT)
public class NoContentApiError extends RuntimeException{
    public NoContentApiError(String message) {
        super(message);
    }
}
