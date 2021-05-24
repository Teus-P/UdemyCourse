package udemy.fortune_service;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

    String[] fortunes = new String[]{
            "Random fortune 1",
            "Random fortune 2",
            "Random fortune 3"
    };

    @Override
    public String getFortune() {
        Random random = new Random();
        return fortunes[random.nextInt(3)];
    }
}
