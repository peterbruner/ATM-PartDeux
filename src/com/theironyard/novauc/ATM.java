package com.theironyard.novauc;

import java.util.HashMap;
import java.util.Scanner;


public class ATM {

    Scanner input = new Scanner(System.in);


    public static void main(String[] args) throws Exception {

        //HashMap<String, Double> switchBoard = new HashMap<>();

        HashMap<String, User> switchBoard = new HashMap<>();
        switchBoard.put("Gmoney", new User("Washington", 55.55));
        switchBoard.put("Bfreezy", new User("Clinton", 77.77));

        //testing a few things to prove that I can get the information from the hashmap
        String informationName = switchBoard.get("Gmoney").getName();
        System.out.println(informationName);

        double informationBalance = switchBoard.get("Gmoney").getBalance();
        System.out.println(informationBalance);

        String informationName2 = switchBoard.get("Bfreezy").getName();
        System.out.println(informationName2);

        double informationBalance2 = switchBoard.get("Bfreezy").getBalance();
        System.out.println(informationBalance2);

        boolean informationName3 = switchBoard.containsKey("Gmoney");
        System.out.println(informationName3);

        //testing to make sure that i can elicit a false response against the hashmap
        boolean informationBalance3 = switchBoard.containsKey("TooSmooth");
        System.out.println(informationBalance3);

        //trying to call a method that will take the user's input [name], check it against the hashmap,
        //and return a boolean value
        //User.informationBalance4();

//        boolean informationBalance5 = switchBoard.containsKey("Gmoney");
//        User.enteredName();
//        System.out.println("Welcome +" enteredName);



    }
}


