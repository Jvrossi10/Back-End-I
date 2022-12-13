package com.example.testeIntegrador.controller;

import com.example.testeIntegrador.model.LinguagemModel;
import com.example.testeIntegrador.service.LinguagemService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LinguagemController {

    private LinguagemService linguagemService;

    public LinguagemController(){
        this.linguagemService = new LinguagemService();
    }

    @GetMapping("/linguagens/{tipo}")
    public ResponseEntity<?> buscarPorTipo(@PathVariable ("tipo") String tipo){
        LinguagemModel linguagemModel = linguagemService.buscarPorTipo(tipo);

        if(linguagemModel == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(linguagemModel,HttpStatus.OK);
    }

    @GetMapping("/linguagens")
    public ResponseEntity<?> buscarTodos(){
        return new ResponseEntity<>(linguagemService,HttpStatus.OK);
    }
}
