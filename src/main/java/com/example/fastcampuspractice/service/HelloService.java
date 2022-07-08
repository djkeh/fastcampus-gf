package com.example.fastcampuspractice.service;

public interface HelloService {

    /**
     * 헬로 서비스는 사용자 이름을 받아서 반갑게 인사해주자.
     *
     * @param name 사용자 이름
     * @return 인사해준다
     */
    String sayHello(String name);
}
