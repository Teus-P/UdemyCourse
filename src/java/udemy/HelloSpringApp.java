package udemy;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import udemy.coach.Coach;
import udemy.coach.RandomCoach;

public class HelloSpringApp {

    public static void main(String[] args){
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

//        Coach coach = context.getBean("myCoach", Coach.class);
        Coach coach = context.getBean("randomCoach", RandomCoach.class);

        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());

        context.close();
    }
}
