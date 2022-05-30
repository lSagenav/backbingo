package com.sofka.backbingo.controller;

import com.sofka.backbingo.util.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


@Slf4j
@RestController
@CrossOrigin(
        "http://localhost:3000"
)

public class Controller {

    private Response response = new Response();


    @GetMapping(path = "/")
    public Map<String, String> index() {
        var respuesta = new HashMap<String, String>();
        respuesta.put("message", "Programa Backend bingo funcional");
        return respuesta;
    }

}
