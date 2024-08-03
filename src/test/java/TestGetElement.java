import com.example.logic.GetElement;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestGetElement {

    GetElement getElement = new GetElement();

    @Test
    public void testGetElement() {
        int[] array = {1, 2, 3, 4, 5};

        assertEquals(3, getElement.getElement(array, 2));
        assertEquals(2, getElement.getElement(array, 1));
        assertEquals(4, getElement.getElement(array, 3));
        assertEquals(5, getElement.getElement(array, 4));
        assertEquals(1, getElement.getElement(array, 0));
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> getElement.getElement(array, -1));
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> getElement.getElement(array, 5));
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> getElement.getElement(null, 2));
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> getElement.getElement(new int[]{}, 0));
    }

}
