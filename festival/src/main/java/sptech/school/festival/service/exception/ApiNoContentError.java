package sptech.school.festival.service.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NO_CONTENT)
public class ApiNoContentError extends RuntimeException{
    public ApiNoContentError(String message){
        super(message);
    }
}
