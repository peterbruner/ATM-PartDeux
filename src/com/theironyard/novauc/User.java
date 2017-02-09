package com.theironyard.novauc;

/**
 * Created by peter on 2/9/17.
 */
public class User {

    String OldNew;
    String OldNew2;

    public void chooseOldNew() throws Exception {
        int loopdiloop1 = 1;
        while (loopdiloop1 == 1) {
            System.out.println("existing user or new user? [existing / new / exit]");
            
            
            OldNew2 = ATM.scanner.nextLine();
            if (OldNew2.equalsIgnoreCase("existing")) {
                System.out.println("All up in the heezy!"); //+ this.balance);
            }

            else if (OldNew2.equalsIgnoreCase("new")) {
                System.out.println("idk");
            }
            else if (OldNew2.equalsIgnoreCase("exit")) {
                loopdiloop1 = 0;
            }
            else {
                throw new Exception("Does not compute following the 'what is your name prompt'");
            }
        }
    }
            /*
            switch () {
                case
            })

        }
    }
    //What is your name - if true then x, if false then y
    //name_true - current user
    //name_false - not current user - "would you like to create an account?" yes/no

    //current user - four OldNew2s
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
    String profile; //existing //new
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




}
