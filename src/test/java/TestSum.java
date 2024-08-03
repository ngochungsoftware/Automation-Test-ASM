import com.example.logic.Sum;
import org.junit.jupiter.api.Test;

import static java.lang.Integer.sum;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestSum {
    Sum sum = new Sum();

    @Test
    void testSum() {
        assertEquals(Integer.MAX_VALUE, sum(Integer.MAX_VALUE, 0));
        assertEquals(Integer.MIN_VALUE, sum(Integer.MIN_VALUE, 0));
        assertEquals(Integer.MAX_VALUE, sum(0, Integer.MAX_VALUE));
        assertEquals(Integer.MIN_VALUE, sum(0, Integer.MIN_VALUE));
        assertEquals(2, sum(1, 1));
        assertEquals(-2, sum(-1, -1));
        assertEquals(3000, sum(1000, 2000));
        assertEquals(-3000, sum(-1000, -2000));
        assertEquals(0, sum(1000, -1000));
        assertEquals(0, sum(-1000, 1000));
    }

    @Test
    public void testSumWithInvalidInput() {
        Sum sum = new Sum();
        assertThrows(IllegalArgumentException.class, () -> sum.sum(3.14, 1));
        assertThrows(IllegalArgumentException.class, () -> sum.sum(2.9, 1));
    }


}
