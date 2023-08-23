import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean2.getMessage());

        Cat cat1 = applicationContext.getBean("cat", Cat.class);
        System.out.println(cat1.getName());

        Cat cat2 = applicationContext.getBean("cat", Cat.class);
        System.out.println(cat2.getName());

        System.out.println("Is \'bean\' equal to \'bean2\'? " + (bean == bean2));
        System.out.println("Is \'cat1\' equal to \'cat1\'? " + (cat1 == cat2));
    }
}