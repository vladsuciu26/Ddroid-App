package com.ddroidd.jobs.controller;

import com.ddroidd.jobs.dto.ErrorDetails;
import com.ddroidd.jobs.exception.EmployerNotFoundException;
import com.ddroidd.jobs.exception.JobListingNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandlerController {

    @ExceptionHandler(EmployerNotFoundException.class)
    public ResponseEntity<ErrorDetails> handleEmployerNotFoundException(EmployerNotFoundException exception) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ErrorDetails(exception.getMessage()));
    }

    @ExceptionHandler(JobListingNotFoundException.class)
    public ResponseEntity<ErrorDetails> handleJobListingNotFoundException(JobListingNotFoundException exception) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ErrorDetails(exception.getMessage()));
    }
}
