package exercise.task_05;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    @DisplayName("Should transfer money from one account to another")
    void shouldTestTransfer() {
        //given
        Account sourceAccount = new Account("01", "Bob", "Doe");
        sourceAccount.setBalance(new BigDecimal(10));

        Account destinationAccount = new Account("02", "John", "Doe");

        //when
        sourceAccount.performTransfer(new BigDecimal(5), destinationAccount);

        //then
        assertThat(destinationAccount.getBalance()).isEqualTo(new BigDecimal(5));
        assertThat(sourceAccount.getBalance()).isEqualTo(new BigDecimal(5));

    }

    @Test
    void shouldThrowExceptionForInsufficientFounds() {
        //given
        Account sourceAccount = new Account("01", "Bob", "Doe");
        sourceAccount.setBalance(new BigDecimal(10));

        Account destinationAccount = new Account("02", "John", "Doe");

        //when then
        assertThatThrownBy(() -> sourceAccount.performTransfer(new BigDecimal(15), destinationAccount))
                .isInstanceOf(IllegalStateException.class)
                .hasMessage("Insufficient balance");

    }

}