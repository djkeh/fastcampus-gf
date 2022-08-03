package com.example.fastcampuspractice.controller;

import com.example.fastcampuspractice.service.HelloServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.context.annotation.Import;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@Import(HelloServiceImpl.class)
@WebMvcTest
class MainControllerTest {

    private final MockMvc mvc;

    public MainControllerTest(@Autowired MockMvc mvc) {
        this.mvc = mvc;
    }

    @Test
    void givenNothing_whenRequestingMainPage_thenReturnsMainIndexPage() throws Exception {
        // Given
        String name = "uno";

        // When & Then
        mvc.perform(
                get("/main")
                        .queryParam("name", name)
        )
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.TEXT_HTML))
                .andExpect(view().name("main/index"))
                .andExpect(model().attribute("message", "안녕하세요, " + name))
                .andDo(print()); // TODO: 테스트 성공 여부와 상관 없이 테스트 실행 결과를 받아보고 싶을 때 사용. 원래는 실패할 때만 보여준다. 성공할 때 불필요한 테스트 로그를 발생시키므로 제거하는게 나음.

    }

}
