package beanlifecycle;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifecycleAnnotation {

    @PostConstruct
    public void init() {
        System.out.println("init method annotation is called");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("destroy method annotation is called");
    }

    public void doSomething() {
        System.out.println("xin chao");
    }
}