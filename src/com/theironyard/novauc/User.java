package com.theironyard.novauc;



/**
 * Created by peter on 2/9/17.
 */
public class User {

    String nameSwitchBoard;
    double balanceSwtichBoard;
    int key;
    String enteredName;

    User(String nameSwitchBoard, double balanceSwtichBoard) {
        this.nameSwitchBoard = nameSwitchBoard;
        this.balanceSwtichBoard = balanceSwtichBoard;
    }

    String getName() {
        return nameSwitchBoard;
    }

    double getBalance() {
        return balanceSwtichBoard;
    }

    public void informationBalance4() {
        System.out.println("Showing User class informationBalance4");
    }

    boolean informationBalance4(String name) {
        //enteredName = ATM.input.nextLine();
        //return, true or false or variable that evaluates to t/f
        //void return type for boolean
        System.out.println("Welcome, " + enteredName);
        return true;
    }

}



























