package com.ssibongee.daangnmarket.advice;

import com.ssibongee.daangnmarket.advice.exception.MemberNotFoundException;
import com.ssibongee.daangnmarket.advice.exception.UnAuthorizedAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import static com.ssibongee.daangnmarket.commons.HttpStatusResponseEntity.*;


@RestControllerAdvice
public class ExceptionAdvice {

    @ExceptionHandler(MemberNotFoundException.class)
    public ResponseEntity<HttpStatus> memberNotFoundException() {
        return RESPONSE_NOT_FOUND;
    }

    @ExceptionHandler(UnAuthorizedAccessException.class)
    public ResponseEntity<HttpStatus> unAuthorizedAccessException() {
        return RESPONSE_UNAUTHORIZED;
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<String> validationNotValidException(MethodArgumentNotValidException e) {
        return new ResponseEntity<>(e.getFieldError().getDefaultMessage(), HttpStatus.BAD_REQUEST);
    }
}
