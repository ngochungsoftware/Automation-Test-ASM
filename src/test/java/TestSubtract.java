import com.example.logic.Subtract;
import com.example.logic.Sum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestSubtract {
    Subtract sub = new Subtract();

    @Test
    public void testSubtract() {
        assertEquals(Integer.MAX_VALUE, sub.subtract(Integer.MAX_VALUE, 0));
        assertEquals(Integer.MIN_VALUE, sub.subtract(Integer.MIN_VALUE, 0));
        assertEquals(2147483647, sub.subtract(0, Integer.MIN_VALUE));
        assertEquals(-2147483647, sub.subtract(0, Integer.MAX_VALUE));
        assertEquals(2, sub.subtract(5, 3));
        assertEquals(-2, sub.subtract(-5, -3));
        assertEquals(500, sub.subtract(1000, 500));
        assertEquals(-500, sub.subtract(-1000, -500));
        assertEquals(2000, sub.subtract(1000, -1000));
        assertEquals(-2000, sub.subtract(-1000, 1000));
    }

    @Test
    public void testSubtract2() {
        assertThrows(IllegalArgumentException.class, () -> sub.subtract(3.14, 1));
        assertThrows(IllegalArgumentException.class, () -> sub.subtract(2.9, 1));
    }

}
