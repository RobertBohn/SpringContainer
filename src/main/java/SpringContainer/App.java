package SpringContainer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        /**
         * Return an instance, which may be shared or
         * independent, of the specified bean.
         */
        HelloWorldService obj = (HelloWorldService) context.getBean("helloWorldService");
        obj.setName("Spring 3.2.3");
        String message = obj.sayHello();
        System.out.println(message);
    }
}
