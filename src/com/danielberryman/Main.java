package com.danielberryman;

public class Main {

    public static void main(String[] args) {
	    String myStr = "This is a string";
        System.out.println(myStr);
        myStr = myStr + ", and this is more.";
        System.out.println(myStr);
        myStr = myStr + " \u00A9 2019";
        System.out.println(myStr);
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println(lastString);
        boolean myBool = false;
        lastString = lastString + myBool;
        System.out.println(lastString);
    }
}
