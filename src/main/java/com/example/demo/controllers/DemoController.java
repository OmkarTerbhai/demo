package com.example.demo.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class DemoController {

    @GetMapping("/api/v1/demo")
    public ResponseEntity<?> demo() {
        log.info("Demo called...");

        return new ResponseEntity<>(new SampleJSON(1, "Pinged"), HttpStatus.OK);
    }
}
