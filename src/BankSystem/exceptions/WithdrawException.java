package BankSystem.exceptions;

import java.time.LocalDateTime;

public class WithdrawException extends Exception {
    public WithdrawException(int clientId, double balance, double amount) {
        super("Not enough money,\n" +
                "Withdraw is not allowed for, \n" +
                "client id : " + clientId + '\n' +
                "balance :  " + balance + '\n' +
                "amount : " + amount + '\n' +
                "on : " + LocalDateTime.now());
    }
}
