package udemy;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import udemy.coach.CricketCoach;

public class SetterDemoApp {

    public static void main(String[] args){

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        CricketCoach cricketCoach = context.getBean("myCricketCoach", CricketCoach.class);

        System.out.println(cricketCoach.getDailyWorkout());
        System.out.println(cricketCoach.getDailyFortune());

        System.out.println(cricketCoach.getEmailAddress());
        System.out.println(cricketCoach.getTeam());

        context.close();
    }
}
