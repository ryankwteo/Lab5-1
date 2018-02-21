
/*
 *  import java.util.Random;
 */

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 5.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/5/">Lab 5 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public enum BankAccountType {

        /**
         * CHECKING account type.
         */
        CHECKING,

        /**
         * SAVINGS account type.
         */
        SAVINGS,

        /**
         * STUDENT account type.
         */
        STUDENT,

        /**
         * WORKPLACE account type.
         */
        WORKPLACE
    }

    /**
     * Account number.
     */
    private int accountNumber;

    /**
     * Type of bank account.
     */
    private BankAccountType accountType;

    /**
     * Balance in account.
     */
    private double accountBalance;

    /**
     * Name of the account owner.
     */
    private String ownerName;

    /**
     * Interest rate charged by the bank.
     */
    private double interestRate;

    /**
     * Interest earned by the account owner.
     */
    private double interestEarned;

    /**
     * Creates a new bank account.
     *
     * @param name the name of the account owner.
     * @param accountCategory the type of account to be opened.
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        /*
         * Implement this function
         */
        this.ownerName = name;
        this.accountType = accountCategory;
    }

    /*
     * Implement getters and setters as appropriate for private variables.
     */

    /**
     * Gets account number.
     *
     * @return the account number.
     */
    public int getAccountNumber() {
        return this.accountNumber;
    }

    /**
     * Sets account number.
     *
     * @param newAccountNumber account number to be set.
     */
    public void setAccountNumber(final int newAccountNumber) {
        this.accountNumber = newAccountNumber;
    }

    /**
     * Gets bank account type.
     *
     * @return the account type.
     */
    public BankAccountType getAccountType() {
        return this.accountType;
    }

    /**
     * Sets bank account type.
     *
     * @param newAccountType the new account type to set.
     */
    public void setAccountType(final BankAccountType newAccountType) {
        this.accountType = newAccountType;
    }

    /**
     * Gets account balance.
     *
     * @return the account balance.
     */
    public double getAccountBalance() {
        return accountBalance;
    }

    /**
     * Sets account balance.
     *
     * @param newAccountBalance the account balance to set.
     */
    public void setAccountBalance(final double newAccountBalance) {
        this.accountBalance = newAccountBalance;
    }

    /**
     * Gets owner name.
     *
     * @return the name of the owner.
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * Sets owner name.
     *
     * @param newOwnerName the new owner name to set.
     */
    public void setOwnerName(final String newOwnerName) {
        this.ownerName = newOwnerName;
    }

    /**
     * Gets interest earned.
     *
     * @return the interest earned.
     */
    public double getInterestEarned() {
        return interestEarned;
    }

    /**
     * Sets interest earned.
     *
     * @param newInterestEarned the new interest earned to set.
     */
    public void setInterestEarned(final double newInterestEarned) {
        this.interestEarned = newInterestEarned;
    }

    /**
     * Sets interest rate.
     *
     * @param newInterestRate the new interest rate to set.
     */
    public void setInterestRate(final double newInterestRate) {
        this.interestRate = newInterestRate;
    }

    /**
     * Gets interest rate.
     *
     * @return the interest rate.
     */
    public double getInterestRate() {
        return interestRate;
    }
}