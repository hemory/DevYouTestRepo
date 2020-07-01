package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    //array syntax
        String[] stringArray = new String[3]; //[0] [1] [2]
        stringArray[0] = "Joe";
        stringArray[2] = "Bob";
        stringArray[1] = "Marie";

        for (int i = 0; i < stringArray.length; i++){
            System.out.println(stringArray[i]);
        }

        for (String item: stringArray) {
            System.out.println(item);
        }

        //arraylist
        ArrayList<String> groceries = new ArrayList<String>();
        groceries.add("milk"); //[0]
        groceries.add("bread"); //[1]
        groceries.add("eggs"); // [2]

        System.out.println(groceries.get(0));


    }
}
