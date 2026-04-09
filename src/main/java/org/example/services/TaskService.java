package org.example.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class TaskService {
    private int taskCount = 0;
    private List<String> taskList = new ArrayList<>(List.of(
            "Выпей воды 💧",
            "Сделай глубокий вдох 😮‍💨",
            "Встань и разомнись 🚶",
            "Улыбнись 😊",
            "Выключи уведомления на 10 минут 📵",
            "Похвали себя за что-то 👍"
    ));

//    private List<String> taskList = new ArrayList<>() {{
//        addTask("Улыбнись \uD83D\uDE0A");
//        addTask("Похвали себя за что-то \uD83D\uDC4D");
//        addTask("Выключи уведомления на 10 минут \uD83D\uDCF5");
//        addTask("Встань и разомнись \uD83D\uDEB6");
//        addTask("Сделай глубокий вдох \uD83D\uDE2E\u200D");
//        addTask("Выпей воды \uD83D\uDCA7");
//    }};

        public String getRandomTask() {
        taskCount++;
        int index = (int) (Math.random() * taskList.size());
        return taskList.get(index);
    }

    public int getTaskCount() {
        return taskCount;
    }

    public String addTask(String task) {
        System.out.println("Task: " + task);
        taskList.add(task);
        System.out.println("List task: " + taskList);
        return task;
    }
}
