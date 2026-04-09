package org.example.controllers;
import org.example.services.TaskService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

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
public class TaskController {

    private final TaskService taskService;

    /*
    TODO
     Конструктор используется при создании Spring(ом) объекта AdviceController
     */
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/task")
    public String getRandomTask() {
        return taskService.getRandomTask();
    }

    @GetMapping("/count")
    public int getTaskCount() {
        return taskService.getTaskCount();
    }

    @PostMapping("/add_task")
    public ResponseEntity.BodyBuilder addTask(@RequestBody Map<String, String> task) {
        try {
            Map<String, String> mapCurrentTask = task;
            String getTask = "";
            for (Map.Entry<String, String> entry : mapCurrentTask.entrySet()) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
                getTask = entry.getValue();
            }

            taskService.addTask(getTask);
            return ResponseEntity.status(HttpStatus.OK);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST);
        }
    }
}
