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

    @Test
    void TestMulSuccess(){
        assertEquals(8, myCalc.mul(4,2));
    }

    @Test
    void TestMulFail(){
        Exception ex = assertThrows(IllegalArgumentException.class, ()->{myCalc.mul(Integer.MAX_VALUE, 4);});
        assertEquals("Your values are too large", ex.getMessage());
    }

    @Test
    void TestDivSuccess(){
        assertEquals(2, myCalc.div(4,2));
    }

    @Test
    void TestDivFailZero(){
        Exception ex = assertThrows(ArithmeticException.class, ()->{myCalc.div(5, 0);});
        assertEquals("You can't divide by 0", ex.getMessage());
    }
}
