package com.zipcodewilmington;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {

        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {

        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {

        return array[array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {

        return array[array.length - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for(String word : array){
            if(value.equals(word)){
                return true;
            }
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
       String[] reversedArray = new String[array.length];
       for(int i = 0; i < array.length; i++){
           reversedArray[i] = array[array.length - i - 1];
       }
       return reversedArray;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        String[] reversedArray = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = array[array.length - i - 1];
        }
        if (Arrays.equals(reversedArray, array)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        //Define a string containing all the letters of the alphabet
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        //convert the sting of letters to a char array
        char[] alphaArray = alpha.toCharArray();
        //Make Stringbuilder object
        StringBuilder sb = new StringBuilder();
        //Loop through each index of input array to make everything lowercase
        for(String i : array){
            sb.append(i.toLowerCase());
        }
        //Assign StringBuilder instance to new variable
        String newConcatString = sb.toString();
        //Loop through each char of alphabet array
        for(char letter : alphaArray){
            //if concatString doesnt contain each letter of alphaArray return false
            if(!newConcatString.contains(String.valueOf(letter))){
                return false;
            }
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int counter = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i].equals(value)){
                counter++;
            }
        }
        return counter;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
            List<String> newArr = new ArrayList<>(Arrays.asList(array));
            newArr.remove(valueToRemove);
            array = newArr.toArray(new String[0]);
        return array;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        List<String> newList = new ArrayList<>(Arrays.asList(array));
        for(int i = newList.size() - 1; i > 0; i--){
            if(newList.get(i).equals(newList.get(i - 1))){
                newList.remove(i);
            }

        }
        return newList.toArray(new String[0]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
//       StringBuilder sb = new StringBuilder();
//        for(int i = 0; i < array.length; i++){
//            int number = 0;
//           for(int m = i; m < array.length; m++){
//               if(array[i].equals(array[m])){
//                    number++;
//                    sb.append(array[i]);
//               }
//           }
//           i += number - 1;
//        }
//        String s = sb.toString();
//        System.out.println(s);
//        return s.split(",");

        ArrayList<String> arrayList = new ArrayList<>();
        for (String str : array) {
            if (arrayList.isEmpty()) {
                arrayList.add(str);
            } else if (arrayList.get(arrayList.size() - 1).contains(str)) {
                arrayList.set(arrayList.size() - 1, arrayList.get(arrayList.size() - 1).concat(str));
            } else {
                arrayList.add(str);
            }
        }
        return arrayList.toArray(new String[0]);
    }

    }


