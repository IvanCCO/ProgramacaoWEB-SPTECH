package sptech.school.atividade1notasprint3.service.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotFound extends RuntimeException{

    public NotFound(String message) {
        super(message);
    }
}
