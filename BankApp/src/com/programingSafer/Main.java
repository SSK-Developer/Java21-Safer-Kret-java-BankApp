package com.programingSafer;

public class Main {

    public static void main(String[] args) {

        Bank b1 = new Bank();

        //create customer 1
        b1.addCustomer(new Customer("Safer", 2001));
        // add accounts
        b1.bankAddAccount(2001);


        //create customer 2
        b1.addCustomer(new Customer("guinness", 2015));
        //add accounts
        b1.bankAddAccount(2015);


        //print all accounts
        System.out.println(b1.getCustomers());


        //print acc info
        System.out.println(b1.printAccountInfo(2001));
        System.out.println(b1.printAccountInfo(2015));


        //deposit money to accounts
        b1.bankDeposit(2001,1,500);
        b1.bankDeposit(2001,1,500);
        b1.bankDeposit(2015,1,500);



        //withdraw money from accounts
        b1.bankWithdraw(2001,1,500);
        b1.bankWithdraw(2015,1,900);



        //change customer name
        b1.changeCustomerName("new safer", 2001);
        b1.changeCustomerName("new guinness", 2015);


        //remove one account
        b1.removeAccount(1, 2001);
        b1.removeAccount(1, 2015);
        System.out.println(b1.printAccountInfo(2001));
        System.out.println(b1.printAccountInfo(2015));


        //remove customer + accounts
        b1.RemoveCustomer(2001);
        b1.RemoveCustomer(2015);
        System.out.println(b1.printAccountInfo(2001));
        System.out.println(b1.printAccountInfo(2015));
        System.out.println(b1.getCustomers());

    }
}