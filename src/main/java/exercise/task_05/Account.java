package exercise.task_05;

import java.math.BigDecimal;

/**
 * Dla klasy Account zawierającej pola: saldo, numer rachunku, imię i nazwisko właściciela,
 * stwórz metodę, oraz napisz jej testy jednostkowe,
 * która symuluje wykonanie przelewu między dwoma rachunkami bankowymi.
 *
 * W testach sprawdź poprawność numeru rachunku (26 cyfr),
 * saldo dla rachunku po wysłaniu/odebraniu przelewu,
 * czy wszystkie powyższe pola w przelewie zostały uzupełnione,
 * czy kwota przelewu wychodzącego jest mniejsza lub równa wartości środków na rachunku.
 *
 */

public class Account {

    private String accountNumber;
    private String ownerName;
    private String ownerSurname;
    private BigDecimal balance;

    public Account(String accountNumber, String ownerName, String ownerSurname) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.ownerSurname = ownerSurname;
        this.balance = BigDecimal.ZERO;
    }

    public void performTransfer(BigDecimal amount, Account destinationAccount) {
        if (this.getBalance().intValue() >= amount.intValue()) {
            destinationAccount.setBalance(destinationAccount.getBalance().add(amount));
            this.setBalance(this.getBalance().subtract(amount));
        } else {
            throw new IllegalStateException("Insufficient balance");
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getOwnerSurname() {
        return ownerSurname;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
