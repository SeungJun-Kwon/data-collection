package com.sparta.datacollection.global.exception;

import com.sparta.datacollection.global.dto.ExceptionResponse;
import java.util.Objects;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler({IllegalArgumentException.class})
    public ResponseEntity<ExceptionResponse> handleIllegalArgumentException(Exception ex) {
        ExceptionResponse response = ExceptionResponse.builder()
            .msg(ex.getMessage())
            .httpCode(HttpStatus.BAD_REQUEST.value())
            .build();

        ex.printStackTrace();
        log.info(ex.getMessage());
        return ResponseEntity.badRequest().body(response);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ExceptionResponse> handleValidationException(
        MethodArgumentNotValidException ex) {
        ExceptionResponse response = ExceptionResponse.builder()
            .msg(Objects.requireNonNull(ex.getFieldError()).getDefaultMessage())
            .httpCode(HttpStatus.BAD_REQUEST.value())
            .build();
        return ResponseEntity.badRequest().body(response);
    }
}
