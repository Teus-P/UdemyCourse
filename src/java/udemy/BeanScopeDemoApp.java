package udemy;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import udemy.coach.Coach;

public class BeanScopeDemoApp {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        Coach coach = context.getBean("myCoach", Coach.class);
        Coach alphaCoach = context.getBean("myCoach", Coach.class);

        boolean value = coach == alphaCoach;

        System.out.println("Pointing to the same object: " + value);
        System.out.println("Memory location for coach: " + coach);
        System.out.println("Memory location for alphaCoach: " + alphaCoach);

        context.close();
    }
}
