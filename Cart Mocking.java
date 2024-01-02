import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.util.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
public interface Cart {
    List<Double> getItems();
}
public class Shopping {
    private final Cart cartRepository;
    public Shopping(Cart cartRepository) {
        this.cartRepository = cartRepository;
    }
    public double calculateTotalPrice() {
        List<Double> items = cart.getItems();
        double totalPrice = 0;
        for (Double item : items) {
            totalPrice += item;
        }
        return totalPrice;
    }
}
public class ShoppingTest {
    @Test
    public void testCalculateTotalPrice() {
        Cart cartRepository = Mockito.mock(Cart.class);
        when(cartRepository.getItems()).thenReturn(Arrays.asList(10.0, 20.0, 30.0));
        Shopping shoppingCartService = new Shopping(cartRepository);
        double totalPrice = shoppingCartService.calculateTotalPrice();
        assertEquals(60.0, totalPrice); 
    }
}
