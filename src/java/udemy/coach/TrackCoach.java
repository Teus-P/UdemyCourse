package udemy.coach;

import udemy.fortune_service.FortuneService;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach() {
    }

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return "Just Do It: " + fortuneService.getFortune();
    }

    public void doMyStartupStuff() {
        System.out.println("TrackCoach: inside method doMyStartupStuff.");
    }

    public void doMyCleanupStuffYoYo() {
        System.out.println("TrackCoach: inside method doMyCleanupStuffYoYo.");
    }
}
