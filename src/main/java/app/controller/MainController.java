package app.controller;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @Autowired
    public Logger logger;

    @GetMapping("/main")
    public String mainPage() {
        logger.info("Logging started");
        return "HELLO FROM SPRING BOOT";
    }
}
