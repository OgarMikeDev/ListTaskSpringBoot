package org.example.services;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Random;

@Service
public class AdviceService {

    private int adviceCount = 0;
    private final Random random = new Random();

    private final List<String> adviceList = List.of(
            "Выпей воды 💧",
            "Сделай глубокий вдох 😮‍💨",
            "Встань и разомнись 🚶",
            "Улыбнись 😊",
            "Выключи уведомления на 10 минут 📵",
            "Похвали себя за что-то 👍"
    );

    public String getRandomAdvice() {
        adviceCount++;
        int index = random.nextInt(adviceList.size());
        return adviceList.get(index);
    }

    public int getAdviceCount() {
        return adviceCount;
    }
}
