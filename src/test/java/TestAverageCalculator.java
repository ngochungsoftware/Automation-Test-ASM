import com.example.logic.AverageCalculator;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestAverageCalculator {
    AverageCalculator averageCalculator = new AverageCalculator();

    AverageCalculator calculator = new AverageCalculator();

    @Test
    public void testCalculateAverage() {
        assertEquals(3.0, calculator.calculateAverage(Arrays.asList(1, 2, 3, 4, 5)), 0.001);
        assertEquals(4.0, calculator.calculateAverage(Arrays.asList(4, 4, 4, 4)), 0.001);
        assertEquals(0.0, calculator.calculateAverage(Arrays.asList(0, 0, 0, 0)), 0.001);
        assertEquals(5.0, calculator.calculateAverage(Collections.singletonList(5)), 0.001);
    }

    @Test
    public void testCalculateAverageWithNegativeNumbers() {
        assertEquals(-3.0, calculator.calculateAverage(Arrays.asList(-1, -2, -3, -4, -5)), 0.001);
        assertEquals(0.0, calculator.calculateAverage(Arrays.asList(-1, 1, -2, 2)), 0.001);
    }

    @Test
    public void testCalculateAverageWithEmptyList() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.calculateAverage(Collections.emptyList());
        });
    }

    @Test
    public void testCalculateAverageWithNullList() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.calculateAverage(null);
        });
    }
}
