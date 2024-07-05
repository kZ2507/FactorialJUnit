package org.example;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.example.FactorialTest.*;

class Testing {
    @Test
    public void factorilMinus() {
        int result = factorialCalc(-1);
        Assertions.assertEquals(1, result);
    }

    @Test
    public void factorialZero() {
        int result = factorialCalc(0);
        Assertions.assertEquals(1, result);
    }
    @Test
    public void factorialNumber() {
        int rerult = factorialCalc(3);
        Assertions.assertEquals(6, rerult);
    }
    @Test
    public void factorialWrong() {
        int rerult = factorialCalc(3);
        Assertions.assertEquals(8, rerult);
    }
}
