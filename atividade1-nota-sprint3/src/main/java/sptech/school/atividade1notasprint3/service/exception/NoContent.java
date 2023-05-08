package sptech.school.atividade1notasprint3.service.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NO_CONTENT)
public class NoContent extends RuntimeException{

    public NoContent(String message) {
        super(message);
    }
}