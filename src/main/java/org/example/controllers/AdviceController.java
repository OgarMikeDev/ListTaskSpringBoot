package org.example.controllers;
import org.springframework.web.bind.annotation.*;
import org.example.services.AdviceService;

/*
TODO
 @RestController означает, что класс будет отвечать на HTTP-запросы,
 а именно возвращать данные(текст или json).
 Как вывеска слова "магазин", чтобы люди заходили в помещение.
 */
@RestController
public class AdviceController {

    private final AdviceService adviceService;

    public AdviceController(AdviceService adviceService) {
        this.adviceService = adviceService;
    }

    @GetMapping("/advice")
    public String getRandomAdvice() {
        return adviceService.getRandomAdvice();
    }

    @GetMapping("/count")
    public int getAdviceCount() {
        return adviceService.getAdviceCount();
    }
}