package aspect.oriented.concepts;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {
    // Aspects
    // 1. Logging
    // 2. Authentication & Authorization
    // 3. Sanity Check
    public void checkout() {
        System.out.println("Cart is checked out");
    }
}
