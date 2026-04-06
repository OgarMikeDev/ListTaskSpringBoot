package org.example.controllers;
import org.springframework.web.bind.annotation.*;
import org.example.services.AdviceService;

/*
TODO
 @RestController означает, что класс будет отвечать на HTTP-запросы,
 а именно возвращать данные(текст или json).
 Как вывеска слова "магазин", чтобы люди заходили в помещение.
 При запуске программы, когда Spring Boot стартует, он:
    1) Видит @RestController
    2) Понимает: "Нужно создать объект этого класса"
    3) Создаёт объект с помощью конструктора
    4) Кладёт его в свою "копилку" (контейнер Spring)
 */
@RestController
public class AdviceController {

    private final AdviceService adviceService;

    /*
    TODO
    Конструктор используется при создании Spring(ом) объекта AdviceController
     */
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