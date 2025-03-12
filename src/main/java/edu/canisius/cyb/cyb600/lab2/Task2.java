package edu.canisius.cyb.cyb600.lab2;

import java.util.Objects;

public class Task2 {

    public String method1(String parameter1){
//        char[] characters=parameter1.toUpperCase().toCharArray();
//        char temp=characters[1];
//        characters[1]=characters[2];
//        characters[2]=temp;
//        return new String(characters);
        if (Objects.equals(parameter1,null)){
            return "";
        };
        return new StringBuilder(parameter1).reverse().toString().toUpperCase();
    }

    public String method2(String parameter2){
        if (Objects.equals(parameter2,null)){
            return "";
        }
        else if(Objects.equals(parameter2,"")){
            return "";
        }
        int length = parameter2.length();
        char firstChar = parameter2.charAt(0);

        // Use StringBuilder to repeat the first character
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= length; i++) {
            result.append(firstChar);
        }

        // Append the rest of the string
        result.append(parameter2.substring(1));

        return result.toString();
    }

    public String method3(String parameter3){
        if (Objects.equals(parameter3,null)){
            return "";
        }
        else if(Objects.equals(parameter3,"")){
            return "";
        }
        String[] words = parameter3.split("\\s+"); // Split by spaces
        StringBuilder reversed = new StringBuilder();

        // Iterate through the words in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]).append(" ");
        }

        return reversed.toString().trim();
    }
}