package com.womanbank.api.banco.controllers.exceptions;

import com.womanbank.api.banco.services.exceptions.InvalidInputException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.InvalidDataAccessApiUsageException;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestControllerAdvice
public class ControllerAdvisor {

    @ExceptionHandler(value = {InvalidInputException.class})
    public ResponseEntity<Object> handleInvalidInputException(InvalidInputException exception) {
        Map<String, Object> body = new LinkedHashMap<>();
        body.put("errorCode","BAD_REQUEST");
        body.put("errorMessage", exception.getMessage());
        body.put("timestamp", LocalDateTime.now());
        return new ResponseEntity<>(body, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(ChangeSetPersister.NotFoundException.class)
    public ResponseEntity<Object> handleNotFoundException(ChangeSetPersister.NotFoundException ex, WebRequest request)
    {
        Map<String, Object> body = new LinkedHashMap<>();
        body.put("errorCode","NOT FOUND");
        body.put("errorMessage", "Data not found");
        body.put("timestamp", LocalDateTime.now());
        return new ResponseEntity<>(body, HttpStatus.NOT_FOUND);    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    protected ResponseEntity<Object> handleMethodArgumentNotValidException(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        Map<String, Object> body = new LinkedHashMap<>();
        body.put("status", status.value());
        List<String> errors = ex.getBindingResult().getFieldErrors()
                .stream()
                .map(x -> x.getDefaultMessage())
                .collect(Collectors.toList());

        body.put("errors", errors);
        body.put("timestamp", LocalDate.now());
        return new ResponseEntity<>(body, HttpStatus.BAD_REQUEST);    }

    @ExceptionHandler(DataIntegrityViolationException.class)
    protected ResponseEntity<Object> handleDataIntegrityViolationException(DataIntegrityViolationException ex, WebRequest request){
        Map<String, Object> body = new LinkedHashMap<>();
        body.put("errorCode","BAD_REQUEST");
        body.put("errorMessage", ex.getCause().getCause().toString());
        body.put("timestamp", LocalDateTime.now());
        return new ResponseEntity<>(body,HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(NoSuchMethodError.class)
    protected ResponseEntity<Object> handleNoSuchMethodErrorException(DataIntegrityViolationException ex, WebRequest request){
        Map<String, Object> body = new LinkedHashMap<>();
        body.put("errorCode","INTERNAL_ERROR");
        body.put("errorMessage", ex.getLocalizedMessage());
        body.put("timestamp", LocalDateTime.now());
        return new ResponseEntity<>(body,HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(IllegalArgumentException.class)
    protected ResponseEntity<Object> handleIllegalArgumentException(DataIntegrityViolationException ex, WebRequest request){
        Map<String, Object> body = new LinkedHashMap<>();
        body.put("errorCode","INTERNAL_ERROR");
        body.put("errorMessage", ex.getLocalizedMessage());
        body.put("timestamp", LocalDateTime.now());
        return new ResponseEntity<>(body,HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(InvalidDataAccessApiUsageException.class)
    protected ResponseEntity<Object> handleInvalidDataAccessApiUsageException(DataIntegrityViolationException ex, WebRequest request){
        Map<String, Object> body = new LinkedHashMap<>();
        body.put("errorCode","BAD_REQUEST");
        body.put("errorMessage", ex.getLocalizedMessage());
        body.put("timestamp", LocalDateTime.now());
        return new ResponseEntity<>(body,HttpStatus.BAD_REQUEST);
    }
}