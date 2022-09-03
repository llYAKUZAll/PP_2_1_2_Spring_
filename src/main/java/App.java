import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean1 = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean1.getMessage());
        System.out.println(bean2.getMessage());
        System.out.println(bean1.equals(bean2));

        ApplicationContext applicationContext2 = new AnnotationConfigApplicationContext(AppConfig.class);
        Cat beanCat1 = (Cat) applicationContext2.getBean("cat");
        Cat beanCat2 = (Cat) applicationContext2.getBean("cat");
        System.out.println(beanCat1.getMessage());
        System.out.println(beanCat2.getMessage());
        System.out.println(beanCat1.equals(beanCat2));
    }
}