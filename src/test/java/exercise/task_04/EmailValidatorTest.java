package exercise.task_04;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class EmailValidatorTest {

    @Test
    void shouldReturnFalseForNullEmail() {
        //given
        EmailValidator emailValidator = new EmailValidator();

        //when
        boolean result = emailValidator.isValidMail(null);

        //then
        assertThat(result).isFalse();
    }

    @ParameterizedTest
    @CsvSource({"a, false"
            ,"a@a.com, true"})
    void shouldValidateMail(String input, boolean expected){
        //given
        EmailValidator emailValidator = new EmailValidator();

        //when
        boolean result = emailValidator.isValidMail(input);

        //then
        assertThat(result).isEqualTo(expected);
    }

}