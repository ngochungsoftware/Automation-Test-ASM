import com.example.logic.Multiply;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestMultiply {
    Multiply multiply = new Multiply();

    @Test
    void testMultiply() {
        assertEquals(Integer.MAX_VALUE, multiply.multiply(Integer.MAX_VALUE, 1));
        assertEquals(Integer.MIN_VALUE, multiply.multiply(Integer.MIN_VALUE, 1));
        assertEquals(Integer.MAX_VALUE, multiply.multiply(1, Integer.MAX_VALUE));
        assertEquals(Integer.MIN_VALUE, multiply.multiply(1, Integer.MIN_VALUE));
        assertEquals(6, multiply.multiply(2, 3));
        assertEquals(6, multiply.multiply(-2, -3));
        assertEquals(0, multiply.multiply(0, 1000));
        assertEquals(-1000000, multiply.multiply(-1000, 1000));
        assertEquals(-1000000, multiply.multiply(1000, -1000));
        assertEquals(1000, multiply.multiply(100, 10));
    }

    @Test
    void testMultiply2() {
        assertThrows(IllegalArgumentException.class, () -> multiply.multiply(-10,2.7));
    }

}
