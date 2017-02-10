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

        //users.getPeeps().put("peter", 9.99);


        users.askName();
        users.nameTest();

//        HashMap<String, Double> peeps = new HashMap();
//       peeps.put("Peter",99.99);
//        peeps.put("Abraham",88.88);


        //Boolean peepsNames = peeps.containsKey(users.theUsersNameIs);



        System.out.println("Boom-shaka-laka!");
    }
  }


/*

























        HashMap<String, Double> peeps = new HashMap();
        peeps.put("Peter",99.99);
        peeps.put("Abraham",88.88);
        //peeps.put(pullname.fromsomwhere,pullcorresponding.balance)

        //probably something with a scanner
        //System.out.println("Want to see a balance?");

        Boolean peepsNames = peeps.containsKey(users.theUsersNameIs);
        //either a scanner here, or in the above switch to handle an input?
        System.out.println(peepsNames);
        System.out.println()
        //prints boolean peepsNames value, but exits through nameTest
        users.nameTest();
    }
}
*/