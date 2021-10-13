package peaksoft;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person1 = context.getBean("myFirstPerson", Person.class);
        Person person2 = context.getBean("mySecondPerson", Person.class);
        System.out.println(person1);
        System.out.println(person2);
    }
}
