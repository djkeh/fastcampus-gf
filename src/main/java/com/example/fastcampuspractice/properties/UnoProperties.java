package com.example.fastcampuspractice.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@ConstructorBinding
@ConfigurationProperties("uno")
public record UnoProperties(
        Korean korean,
        English english
) {

    public static record Korean(String hello) {}
    public static record English(String hello) {}

}
