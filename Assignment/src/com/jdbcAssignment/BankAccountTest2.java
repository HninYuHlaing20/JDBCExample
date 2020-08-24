package com.jdbcAssignment;

public class BankAccountTest2 {
	public static void main(String[] args)
    {
        // create two BankAccount objects
        BankAccount first = new BankAccount("111111", 20000);
        BankAccount second = new BankAccount("2222222", 30000);

        // print initial balances
        System.out.printf("Account #%s has initial balance of $%.2f%n",
                first.getId(), first.getAmount());

        System.out.printf("Account #%s has initial balance of $%.2f%n",
                second.getId(), second.getAmount());

        // transfer $5000 from first to second account (via transferFundsA())
        first.transferFundsA(second, 5000);

        // print new balances
        System.out.println("\nAfter \"first.transferFunds(second, 5000)\" ...");
        System.out.printf("Account #%s has new balance of $%.2f%n",
                first.getId(), first.getAmount());

        System.out.printf("Account #%s has new balance of $%.2f%n",
                second.getId(), second.getAmount());

        // transfer $10000 from second account to first (via transferFundsB())
        second.transferFundsB(first, 10000);

        // print new balances
        System.out.println("\nAfter \"second.transferFunds(first, 10000)\" ...");
        System.out.printf("Account #%s has new balance of $%.2f%n",
                first.getId(), first.getAmount());

        System.out.printf("Account #%s has new balance of $%.2f%n",
                second.getId(), second.getAmount());
    }
}
