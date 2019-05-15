package com.adiaz.hellodevtools;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/vamos")
    public String sayHello() {
        return "OLE OLE OLE....CHOLO SIMEONE!!!!!!!";
    }
}
