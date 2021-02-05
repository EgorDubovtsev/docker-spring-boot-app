package app.controller;

import app.service.RequestCountService;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @Autowired
    private Logger logger;
    @Autowired
    private RequestCountService requestCountService;

    @GetMapping("/")
    public String index() {
        return "INDEX PAGE";
    }

    @GetMapping("/main")
    public String mainPage() {
        logger.info("Logging started");
        requestCountService.incrementCounter();
        logger.info("TOTAL REQUESTS: {}", requestCountService.getCountOfRequests());

        return "HELLO FROM SPRING BOOT";
    }
}
