package ru.netology.advice;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import ru.netology.exceptions.InvalidCredentials;
import ru.netology.exceptions.UnauthorizedUser;

@RestControllerAdvice
public class ExceptionHandlerAdvice {
    @ExceptionHandler(InvalidCredentials.class)
    public ResponseEntity<String> invalidCredentialsHandler(UnauthorizedUser exception) {
        return new ResponseEntity<>(exception.getMessage(), HttpStatusCode.valueOf(400));
    }

    @ExceptionHandler(UnauthorizedUser.class)
    public ResponseEntity<String> unauthorizedUserHandler(UnauthorizedUser exception) {
        System.out.println(exception.getMessage());
        return new ResponseEntity<>(exception.getMessage(), HttpStatusCode.valueOf(401));
    }

}
