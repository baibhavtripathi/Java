package annotation.based.configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

@ComponentScan(basePackages = "annotation.based.configuration")
public class Main {
    public static void main(String[] args) {
        /*
            //  Basic Java Way
            Developer developer = new Developer();
            developer.role();
         */

        /*
        Spring Way - Annotation based
         */
        ApplicationContext context =
//                new ClassPathXmlApplicationContext("config.xml");
                new AnnotationConfigApplicationContext(Main.class);
        Developer developer = context.getBean(Developer.class);
        developer.role();
        developer.setSkills(Arrays.asList("Lisp", "Perl"));
        System.out.println(developer.getSkills());
        Developer developer1 = context.getBean(Developer.class);
        System.out.println(developer1.getSkills());

        Architect architect = context.getBean(Architect.class);
        architect.role();
    }
}
