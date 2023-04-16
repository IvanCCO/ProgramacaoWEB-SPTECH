package sptech.school.festival.service.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ApiNotFoundError extends RuntimeException{
    public ApiNotFoundError(String message){
        super(message);
    }
}
