package com.example;

import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    void start () {
        var app = new Main();
        app.main(new String[]{"one"});
    }
}
