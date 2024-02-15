package utils;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumCalculatorTest {
    private SumCalculator calc;
    @BeforeEach
    public void init(){
       calc = new SumCalculator();
    }
    @Test
    void sumParamEqualsOneTest() {
        int expectedResult = 1;

        int actualResult = calc.sum(1);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void sumParamEqualsTheeTest() {
        int expectedResult = 6;

        int actualResult = calc.sum(3);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void sumParamEqualsZeroTest(){
        assertThrows(IllegalArgumentException.class, () -> calc.sum(0));
    }

    @Test
    void sumParamIsNegativeTest(){
        assertThrows(IllegalArgumentException.class, () -> calc.sum(-5));
    }
}