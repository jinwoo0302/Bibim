package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }

    //단축키 psvm 개꿀
    //단축키 alt + 1하면 프로젝트 창 닫고 열기
    //lombok깔고 어디 들가서 체크하고 어플라이.
    //gradle 바꾸면 무조건 reload
    //코드를 뜯어보고 싶을 땐 커서 가져다 대고 ctrl + b

}