package com.theironyard.novauc;

import java.util.HashMap;
import java.util.Scanner;

public class ATM {

    public static Scanner scanner = new Scanner(System.in);
    public static Scanner scanner2 = new Scanner(System.in);
    public static User users = new User();

    public static void main(String[] args) throws Exception {
	// write your code here

        System.out.println("Let's get crazy");

        users.chooseOldNew();
        //user.chooseOption();

        HashMap<String, Double> peeps = new HashMap();
        peeps.put("George",99.99);
        peeps.put("Abraham",88.88);
        peeps.put("Herbert",77.77);
        peeps.put("Barack",66.66);
        peeps.put("Donald",55.55);

        //probably something with a scanner
        //System.out.println("Want to see a balance?");

        //box-unbox these amounts into usable ints, but then need to be able to turn them back into strings to be
        //re-entered into the table

        //Double peepsBalances = peeps.get("Herbert");
        //System.out.println(peepsBalances);

        System.out.println("Boom-shaka-laka!");
    }
}
