package exercise.task_01;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;

public class CalculatorTestAssertJ {

    @Test
    @DisplayName("Should return 3 for adding 1 and 2")
    void should_return_3_for_adding_1_and_2() {
        //given
        Calculator calculator = new Calculator();

        //when
        int result = calculator.add(1, 2);

        //then
        assertThat(result).isEqualTo(3);
    }

    @Test
    void divideTest() {
        //given
        Calculator calculator = new Calculator();

        //when
        double result = calculator.divide(1.0, 3.0);

        //then
        assertThat(result).isCloseTo(0.333, within(0.001));

    }

    private void doNothing() {

    }

}
