package udemy;

import udemy.coach.Coach;
import udemy.coach.TrackCoach;

public class MyApp {
    public static void main(String[] args){
        Coach coach = new TrackCoach();

        System.out.println(coach.getDailyWorkout());
    }
}
