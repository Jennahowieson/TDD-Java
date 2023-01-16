import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator;
    @Test
    public void canAddTwoInts() {
        assertEquals(5, calculator.add(2,3));
    }

    @Test
    public void canSubTwoInts() {
        assertEquals(3, calculator.min(5,2));
    }

    @Test
    public void canMultiplyTwoInts() {
        assertEquals(10, calculator.multiply(5,2));
    }

    @Test
    public void canDivideTwoDoubles() {
        assertEquals(5, calculator.divide(10,2), 0.0);
    }
}

