package com.example.fastcampuspractice.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
class HelloServiceImplTest {

    @Autowired private HelloService helloServiceImpl;


    @DisplayName("사용자 이름을 입력하면, 인사를 해준다.")
    @Test
    void givenUserName_whenSayingHello_thenReturnsHelloString() {
        // Given
        String username = "uno";

        // When
        String result = helloServiceImpl.sayHello(username);

        // Then
        assertThat(result).isEqualTo( "안녕하세요, " + username + " !!!");
    }

}