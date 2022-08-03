package com.example.fastcampuspractice.controller.error;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Slf4j
@ControllerAdvice
public class GlobalControllerAdvice {
    @ExceptionHandler
    public void exceptionHandler(Exception e) {
        log.error("아 이거 에러가 심각하네?? {}", e.getLocalizedMessage());
    }
}
