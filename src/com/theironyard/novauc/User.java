package com.theironyard.novauc;


import java.util.Scanner;
import java.util.HashMap;

/**
 * Created by peter on 2/9/17.
 */
public class User {
    Scanner input = new Scanner(System.in);
    Scanner input2 = new Scanner(System.in);
    HashMap<String, Double> switchBoard = new HashMap<>();
    String name;
    double deposit;
    int loopdiloop = 1;



    public void login() {
        while (loopdiloop == 1) {
            System.out.println("Welcome, what is your name? Type exit to quit.");
            name = input.nextLine().toUpperCase();

            if (switchBoard.containsKey(name)) {
                menu();
            }
            else if(name.equals("EXIT")) {
                //TODO: Possible to add method
                System.exit(0);
            }
            else {
                //System.out.println("this line is addUser");
                addUser();
            }
        }
    }

    public void menu(){
        while (loopdiloop == 1) {
            System.out.println("What would you like to do?");
            System.out.println("withdraw / check balance / remove account / cancel");
            switch (input.nextLine()) {
                case "withdraw":
                                    //System.out.println("this is withdraw");
                                    withdraw();
                                    break;
                case "check balance":
                                        //System.out.println("this is checkBalance");
                                        checkBalance();
                                        break;
                case "remove account":
                                        //System.out.println("this is removeAccount");
                                        if(removeAccount())  {
                                            return;
                                        } else {
                                            break;
                                        }

                case "cancel":
                                //System.out.println("this is cancel");
                                //cancel(); not needed with the return; statement
                                return;
                                //break;
                default: System.out.println("Try again");
            }

        }
    }

    public void addUser() {
        //TODO: grab the person's name and remove the below print
        System.out.println("User not found. Add a new user.");
        System.out.println("What is your first name?");
        name = input.nextLine().toUpperCase();
        System.out.println("Using digits only, how much money would you like to deposit?");
        deposit = input2.nextDouble();
        switchBoard.put(name, deposit);
        System.out.println("Account created for " + name + " with $" + deposit + " dollars");
        menu();
    }

    public void withdraw() {
        double withdrawAmount;
        while (loopdiloop == 1) {
            System.out.println("How much would you like to withdraw? (Enter 0 to cancel)");

            withdrawAmount = input2.nextDouble();
            if (withdrawAmount <= switchBoard.get(name)) {
                System.out.println("Withdrawing $" + withdrawAmount);
                switchBoard.put(name, (switchBoard.get(name) - withdrawAmount));
                System.out.println("balance $" + switchBoard.get(name));
                return;
            }
            else {
                System.out.println("You don't have that much");
            }
        }
    }

    public void checkBalance() {
        System.out.println(switchBoard.get(name));
    }

    public boolean removeAccount() {
        while (loopdiloop == 1) {
            System.out.println("Are you sure? [yes/no]");
            if (input.nextLine().equalsIgnoreCase("yes")) {
                switchBoard.remove(name);
                return true;
            }
            else {
                System.out.println("Cancelling");
                return false;
            }
        }
        return false;
    }



}



























