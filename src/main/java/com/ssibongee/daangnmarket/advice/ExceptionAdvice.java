package com.ssibongee.daangnmarket.advice;

import com.ssibongee.daangnmarket.advice.exception.MemberNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import static com.ssibongee.daangnmarket.commons.HttpStatusResponseEntity.RESPONSE_NOT_FOUND;


@RestControllerAdvice
public class ExceptionAdvice {

    @ExceptionHandler(MemberNotFoundException.class)
    public ResponseEntity<HttpStatus> memberNotFoundException() {
        return RESPONSE_NOT_FOUND;
    }

}
