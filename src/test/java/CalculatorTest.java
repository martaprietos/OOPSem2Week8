import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    Calculator myCalc;
    @BeforeEach
    void setup(){
        myCalc = new Calculator();
    }

    @Test
    void TestAddSuccess(){
        assertEquals(8, myCalc.add(4,4));
    }

    @Test
    void testAddFail(){
        Exception ex = assertThrows(IllegalArgumentException.class, ()->{myCalc.add(Integer.MAX_VALUE, 4);});
        assertEquals("Your values are too large", ex.getMessage());
    }

    @Test
    void TestSubSuccess(){
        assertEquals(1, myCalc.sub(5,4));
    }

    @Test
    void TestSubFail(){
        Exception ex = assertThrows(IllegalArgumentException.class, ()->{myCalc.sub(Integer.MIN_VALUE, 4);});
        assertEquals("Your values are too small", ex.getMessage());
    }
}
