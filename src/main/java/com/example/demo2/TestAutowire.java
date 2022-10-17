package com.example.demo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestAutowire {
    @Autowired
    EngineChina engineChina;

//    public TestAutowire() {
//        engineChina = new EngineChina();
//    }

    public void run() {
        engineChina.run();
    }
}
