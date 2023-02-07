package com.example;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MavenJacocoApplicationTest {

    @Test
    void contextLoads() {
        var app = new MavenJacocoApplication();
        app.main(new String[] {"one"});
    }

}
