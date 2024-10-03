package com.iit.oop.week1;

public class BankAccount {
   /* public static void main(String[] args) {
        System.out.println();
    }*/

    private double balance;

    private String accountNumber;

    /**
     * default constructure
     */

    public BankAccount(){
        super();

    }

    /**
     * constructor for the  BankAccount Class
     * @param accountNumber unique identifier for the account
     * @param balance current account balence
     */
    public BankAccount(String accountNumber , double balance ) {
        this.accountNumber = accountNumber;
        this.balance= balance;
    }

    /**
     * Reduse the aCCOUNT bALENCE WHEN THE USER WITHDRWS THE MONEY
     * @param Amount amount to be withdrew
     */
    public void withdraw (double Amount ){
        this.balance -= Amount;
    }

    /**
     * ADD THE AMOUNT ENTERD BY USER
     * @param Amount AMOUNT TO BE DEPOSITED
     */
    public void deposit (double Amount){
        this.balance += Amount;
    }
    public double getBalance (){
        return this.balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                ", accountNumber='" + accountNumber + '\'' +
                '}';
    }

}
