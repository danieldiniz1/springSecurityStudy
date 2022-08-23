package br.com.alura.springsecurity.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/topicos")
public class TopicoController {

    @GetMapping
    public ResponseEntity teste(){
        System.out.println("teste de login ok");
        return ResponseEntity.status(200).build();
    }
}
