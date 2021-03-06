package exercise.task_01;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @Test
    @DisplayName("Should return 3 for adding 1 and 2")
    void should_return_3_for_adding_1_and_2() {
        //given
        Calculator calculator = new Calculator();

        //when
        int result = calculator.add(1, 2);

        //then
        assertEquals(3, result);
    }

    @Test
    void divideTest() {
        //given
        Calculator calculator = new Calculator();

        //when
        double result = calculator.divide(1.0, 1.0);

        //then
        assertEquals(1.0, result);
    }

}