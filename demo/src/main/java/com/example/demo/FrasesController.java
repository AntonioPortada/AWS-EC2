package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api/v1/frase")
@RequiredArgsConstructor
public class FrasesController {

    private final FraseService fraseService;

    @GetMapping
    public ResponseEntity<FraseDTO> getMethodName() {
        return ResponseEntity.ok(fraseService.getFrase());
    }
    
}
