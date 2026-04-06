package org.example.services;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Random;

@Service
public class TaskService {

    private int taskCount = 0;
    private final Random random = new Random();

    private final List<String> taskList = List.of(
            "Выпей воды 💧",
            "Сделай глубокий вдох 😮‍💨",
            "Встань и разомнись 🚶",
            "Улыбнись 😊",
            "Выключи уведомления на 10 минут 📵",
            "Похвали себя за что-то 👍"
    );

    public String getRandomTask() {
        taskCount++;
        int index = random.nextInt(taskList.size());
        return taskList.get(index);
    }

    public int getTaskCount() {
        return taskCount;
    }
}
