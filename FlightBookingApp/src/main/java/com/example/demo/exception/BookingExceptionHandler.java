package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@RestControllerAdvice
public class BookingExceptionHandler extends ResponseEntityExceptionHandler {
    
@ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleException(UserNotFoundException exception){
        ErrorResponse er=new ErrorResponse();
        er.setCode("EMP-400");
        er.setMessage(exception.getMessage());;
        return new ResponseEntity(er,HttpStatus.BAD_REQUEST);
    }
}



