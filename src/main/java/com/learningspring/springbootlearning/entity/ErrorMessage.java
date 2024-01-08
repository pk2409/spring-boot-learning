package com.learningspring.springbootlearning.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;


@Data
@NoArgsConstructor
@AllArgsConstructor

public class ErrorMessage {

    //we will be sending back this class

    private HttpStatus status;
    private String message;
}
