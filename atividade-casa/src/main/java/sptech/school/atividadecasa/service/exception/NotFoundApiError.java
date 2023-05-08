package sptech.school.atividadecasa.service.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotFoundApiError extends RuntimeException{

    public NotFoundApiError(String message) {
        super(message);
    }
}
