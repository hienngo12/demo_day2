package beanlifecycle;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAnnotation {
    public static void main(String[] args) {
        ConfigurableApplicationContext cap = new ClassPathXmlApplicationContext("beanlifecycle/bean.xml");

         LifecycleAnnotation lifecycleAnnotation = new LifecycleAnnotation();
         lifecycleAnnotation.doSomething();

        cap.close();
    }
}
