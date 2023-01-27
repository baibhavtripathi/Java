package aspect.oriented.concepts;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AspectMain {

    public static void main(String[] args) {
        ApplicationContext context =
            new AnnotationConfigApplicationContext(AspectConfig.class);
        ShoppingCart shoppingCart = context.getBean(ShoppingCart.class);
        shoppingCart.checkout();
    }
}
