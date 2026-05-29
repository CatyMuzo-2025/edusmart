package com.edusmart.edusmart.controller;

import com.edusmart.edusmart.service.EduSmartAIService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/edusmart")
public class MarketingController {

    private final EduSmartAIService aiService;

    public MarketingController(EduSmartAIService aiService) {
        this.aiService = aiService;
    }

    @GetMapping("/publicidad")
    public String obtenerPublicidad(@RequestParam String tema, @RequestParam String audiencia) {
        return aiService.generarPublicidad(tema, audiencia);
    }
}
