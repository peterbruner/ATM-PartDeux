package com.theironyard.novauc;

/**
 * Created by peter on 2/9/17.
 */
public class User {

    String theUsersNameIs;
    String nameTest;
    Boolean peepsNames;
    String option;


    public void askName() throws Exception {
        System.out.println("What is your name?");
        theUsersNameIs = ATM.scanner.nextLine();
        System.out.println("Welcome, " + theUsersNameIs);
    }
//    public void chooseName() throws Exception {
//        System.out.println("What is your name?");
//        name = ATM.scanner.nextLine();
//        System.out.println("Welcome, " + name);
//    }


    public void nameTest() throws Exception {
        //takes boolean value of peepsNames and run an if - hopefully a switch
        System.out.println("Made it this far");
        //exit's after this point
        if (peepsNames == true) {
            System.out.println("A genius must have written this");
        }
        else {
            System.out.println("Not looking good! :) :) :)");
        }

    }

    //public User() {}

    public void chooseOption() throws Exception {
        int loopdiloop = 1;
        while(loopdiloop == 1) {
            System.out.println("What would you like to do? [Check balance / Withdraw funds / Cancel my life]");
            option = ATM.scanner.nextLine();
            if (option.equalsIgnoreCase("Check balance")) {
                System.out.println("Current balance: " + this.balance);
            }

            else if (option.equalsIgnoreCase("Withdraw funds")) {
                System.out.println("How much?");
                double moneyRequested = ATM.scanner2.nextDouble();
                if (this.balance >= moneyRequested) {
                    System.out.println("Printing " + moneyRequested);
                    this.balance = this.balance - moneyRequested;
                    System.out.println("Remaining balance: " + this.balance);
                } else {
                    System.out.println("Does not compute");
                }
            }

            else if (option.equalsIgnoreCase("Cancel my life")) {
                System.out.println("Good choice");
                loopdiloop = 0;


            } else {
                throw new Exception("Invalid balance statement");
            }
        }

    }
}



    /*
    //MENUS
        //Current
        //New User
        //New User Prompts
        //Current user Prompts

    String OuterMostMenu;
    String OuterMostMenu2;
    
    //first level existing or new user?

    public void chooseOuterMostMenu() throws Exception {
        int loopdiloop1 = 1;
        while (loopdiloop1 == 1) {
            System.out.println("existing user or new user? [Current User / New User]");

            OuterMostMenu2 = ATM.scanner.nextLine();
            if (OuterMostMenu2.equalsIgnoreCase("Current User?")) {
                System.out.println("All up in the heezy!");
            }
            else if (OuterMostMenu2.equalsIgnoreCase("New User?")) {
                System.out.println("idk");
            }
            else if (OuterMostMenu2.equalsIgnoreCase("Current User Options")) {
                System.out.println("idk");
            }
            else if (OuterMostMenu2.equalsIgnoreCase("New User Prompts")) {
                loopdiloop1 = 0;
            }
            else {
                throw new Exception("Does not compute at first level");
            }
        }
    }


    //second level existing user true
    //public void

    /*
            switch () {
                case
            })

        }
    }
    //What is your name - if true then x, if false then y
    //name_true - current user
    //name_false - not current user - "would you like to create an account?" yes/no

    //current user - four OuterMostMenu2s
    //checkBalance;
    //manageFunds; //withdraw //transfer //add
    //manageProfile; //meh do it later!
    //cancel;

    /*
    //current user? yes/no
    //user is asked to put in their card [card] or create profile
    //if [card] then account
    //if create profile then profile

    //current user yes
    String profile; //currentAccount //newAccount
    String withdraw;
    String cancel;
    double balance;
    double transfer;
    String anotherProfile;
    String deleteProfile;

    //current user no
    String nameFirst;
    String nameLast;
    int pin;
    int phoneNum;
    String moneyIn;

    //current user yes, another
    //int pin;
    //string moneyIn;
    //double transfer

    //inside withdraw
    String howMuch;

    //inside cancel
    String enjoy;

    //inside balance
    */





