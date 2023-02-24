package com.knoldus;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // creating an object of ReverseFunction and calling methods getLength() and reverseString
        ReverseFunction object = new ReverseFunction();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String originalString = input.next();
        String reversed = object.reverseString(originalString);
        int string_length= object.getLength(originalString);
        System.out.println("original string is "+ originalString);
        System.out.println("Reversed String is "+ reversed);
        System.out.println("length of the given string ="+ string_length);
    }
}
