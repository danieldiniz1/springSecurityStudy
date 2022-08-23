package br.com.alura.springsecurity.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/topicos")
public class TopicoController {

    @GetMapping("/liberado")
    public ResponseEntity teste(){
        System.out.println("teste de login ok pois não vai solicitar autenticacao");
        return ResponseEntity.status(200).build();
    }

    @PostMapping("/bloqueado")
    public ResponseEntity testeAutenticaPost(){
        System.out.println("teste de login ok pois solicitou autenticacao e foi validado");
        return ResponseEntity.status(200).build();
    }

    @GetMapping("/bloqueado")
    public ResponseEntity testeAutenticaGet(){
        System.out.println("teste de login ok pois solicitou autenticacao e foi validado");
        return ResponseEntity.status(200).build();
    }
}
