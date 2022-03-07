package BankSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Client {
    private static final int MAX_SIZE = 5;
    private int idClient;
    private String lastName;
    private String firstName;
    private final List<Account> accounts = new ArrayList<>();
    protected double commissionRate;
    protected double interestRate;


    public Client(int idClient, String lastName, String firstName, double commissionRate, double interestRate) {
        this.idClient = idClient;
        this.lastName = lastName;
        this.firstName = firstName;
        this.commissionRate = commissionRate;
        this.interestRate = interestRate;
    }

    public void addAccount(Account account) {
        // is it account.getID?
        if (accounts.contains(account)) {
            System.out.println("Account id already exists");
            return;
        }
        if (this.accounts.size() == MAX_SIZE) {
            System.out.println("There is no space for new account");
        } else {
            System.out.println("Account added successfully");
            this.accounts.add(account);
            loggerActions("Account added successfully", account);
        }
    }

    public void removeAccount(Account account) {
        // is it account.getID?
        if (accounts.contains(account)) {
            accounts.remove(account);
            System.out.println("Account removed successfully");
            loggerActions("Account removed successfully", account);
        } else {
            System.out.println("Account doesn't exist");
        }
    }


    private void loggerActions(String description, Account account) {
        Log log = new Log(account.getAccountID(), description, account.getBalance());
        Logger.getInstance().addLog(log);
    }

    public Account findAccountByID(int id) {
        for (Account acc : this.accounts) {
            if (acc != null && acc.getAccountID() == id) {
                return acc;
            }
        }
        return null;
    }

    private double commission(double amount) {
        return (commissionRate * amount) / 100;
    }

    public void fullReport() {
        System.out.println(getIdClient());
        System.out.println(getFullName());
        System.out.println(getCommissionRate());
        System.out.println(getInterestRate());
        System.out.println(getClass());
    }

    public abstract void draw();

    public void deposit(Account account, double amount) {
        // is it account.getID?
        if (accounts.contains(account)) {
            account.setBalance(account.getBalance() + amount - commission(amount));
            loggerActions("Deposit successfully", account);
            //TODO update total Commission after you create bank class, will this work??
            Bank.updateTotalCommission(commission(amount));
            return;
        } else {
            System.out.println("Account doesn't exist");
        }
    }

    public void withdraw(Account account, double amount) {
        // is it account.getID?
        if (accounts.contains(account)) {
            if (amount + commission(amount) > account.getBalance()) {
                System.out.println("No Overdraft");
            } else {
                System.out.println("Withdraw Successfully");
                account.setBalance(account.getBalance() - amount - commission(amount));
                loggerActions("Withdraw successfully", account);
            }
            return;
        }
        System.out.println("Account doesn't exist");
    }

    public static int getMaxSize() {
        return MAX_SIZE;
    }

    public int getIdClient() {
        return idClient;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getFullName() {
        return getLastName() + " " + getFirstName();
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public List<Account> getAccounts() {
        return this.accounts;
    }

    public double getFortune() {
        double result = 0;
        for (Account acc : this.accounts) {
            if (acc != null) {
                result += acc.getBalance();
            }
        }
        return result;
    }

    public void autoUpdateAccount() {
        //TODO Run with a loop over clients’ account,
        // Update each client account balance with the relevant interest calculation
        // Make sure to Log this operation

        // check if this is the right solution
        for (Account acc : this.accounts) {
            acc.setBalance(acc.getBalance() + (interestRate * acc.getBalance()));
            loggerActions("Interest rate applied", acc);
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return idClient == client.idClient;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idClient);
    }

    @Override
    public String toString() {
        return "Client{" +
                "idClient=" + idClient +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", accounts=" + accounts +
                ", commissionRate=" + commissionRate +
                ", interestRate=" + interestRate +
                '}';
    }
}
