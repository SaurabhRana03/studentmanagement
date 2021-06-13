package com.finaltest.studentmanagement.Exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.time.ZonedDateTime;

@Getter
@Setter
@AllArgsConstructor

public class ExceptionInfo {

    private String message;
    private HttpStatus httpStatus;
    private ZonedDateTime zonedDateTime;
}
