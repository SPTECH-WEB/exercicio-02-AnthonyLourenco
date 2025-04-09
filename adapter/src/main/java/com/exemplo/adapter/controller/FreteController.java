package com.exemplo.adapter.controller;

import com.exemplo.adapter.service.FreteService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/frete")
public class FreteController {
    private final FreteService freteService = new FreteService();

    @GetMapping("/calcular")
    public double calcular(@RequestParam double peso, @RequestParam String modalidade) {
        return freteService.calcularFrete(peso, modalidade);
    }
}
