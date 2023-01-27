package xml.based.configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        /*
            //  Basic Java Way
            Developer developer = new Developer();
            developer.role();
         */

        /*
        Spring Way - XML based
         */
        ApplicationContext context =
                new ClassPathXmlApplicationContext("SpringConfig.xml");
        Developer developer = context.getBean(Developer.class);
        developer.role();
        System.out.println(developer.getSkills());

        Architect architect = context.getBean(Architect.class);
        architect.role();
        System.out.println( "Job Level - " + architect.getLevel() );

    }
}
