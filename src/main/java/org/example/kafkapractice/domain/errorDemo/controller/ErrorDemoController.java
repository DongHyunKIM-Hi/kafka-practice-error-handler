package org.example.kafkapractice.domain.errorDemo.controller;

import lombok.RequiredArgsConstructor;
import org.example.kafkapractice.domain.errorDemo.producoer.ErrorDemoProducer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/error")
public class ErrorDemoController {

    private final ErrorDemoProducer errorDemoProducer;

    @PostMapping
    public ResponseEntity<Void> sendErrorDemoMessage() {
        errorDemoProducer.send("error");
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

}
