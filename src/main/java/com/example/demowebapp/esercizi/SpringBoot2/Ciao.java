package com.example.demowebapp.esercizi.SpringBoot2;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v2")
public class Ciao {
    @RequestMapping(method = RequestMethod.GET, path = "/ciao/{provincia}")
    public Programma ciao(
            @PathVariable String provincia,
            @RequestParam String nome,
            @RequestParam(required = false) String saluto) {
        saluto = "Ciao " + nome + ", com'è il tempo in " + provincia;
        return new Programma(nome, provincia, saluto);
    }
}

