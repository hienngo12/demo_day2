package beanlifecycle;

public class LifecycleXml {
    public void init() {
        System.out.println("init method is called");
    }

    public void destroy() {
        System.out.println("destroy method is called");
    }

    public void doSomething() {
        System.out.println("hello");
    }
}
