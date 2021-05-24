package udemy.coach;

import udemy.fortune_service.FortuneService;

public class RandomCoach implements Coach {

    FortuneService fortuneService;

//    public RandomCoach() {
//    }

    public RandomCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Exterminate 30 xenos.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
