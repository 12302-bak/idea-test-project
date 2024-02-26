package _framework.spring.bean_lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.net.URL;

public class SpringBeanLifeCycleTest {

    public static void main(String[] args) {

        // 获取xml文件的一种方式。
        URL config = SpringBeanLifeCycleTest.class.getResource("../res/Bean-LifeCycle.xml");

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("_framework/spring/res/Bean-LifeCycle.xml");
        Book book = (Book)applicationContext.getBean("book");
        System.out.println("Book name is " + book.getBookName());
        ((ClassPathXmlApplicationContext) applicationContext).destroy();
    }

}
