package udemy;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import udemy.coach.Coach;

public class BeanLifeCycleDemoApp {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");

        Coach coach = context.getBean("myCoach", Coach.class);

        System.out.println(coach.getDailyWorkout());

        context.close();
    }
}
