package com.example.fastcampuspractice.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class LoggingAspect {

    @Pointcut("within(com.example.fastcampuspractice.controller..*)")
    public void onRequest() {}

    @Around("com.example.fastcampuspractice.aspect.LoggingAspect.onRequest()")
    public Object doLogging(ProceedingJoinPoint pjp) throws Throwable {
        long start = System.currentTimeMillis();

        try {
            return pjp.proceed(pjp.getArgs());
        } finally {
            long end = System.currentTimeMillis();
            log.warn(" --- estimated time: {}ms", end - start);
        }
    }
}