package org.example;
import java.util.*;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Quinn Barber
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        int[] num = new int[3];
        System.out.println("Enter the first number:");
        num[0] = input.nextInt();
        System.out.println("Enter the second number:");
        num[1] = input.nextInt();
        System.out.println("Enter the third number:");
        num[2] = input.nextInt();
        int max = num[0];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if( i == j )
                    continue;
                if(num[i] == num[j]){
                    System.out.println("All numbers are not unique");
                    return;
                }
            }
        }
        for(int i = 0; i < 3; i++){
            if(num[i] >= max)
                max = num[i];
        }
        System.out.println("The largest number is " + max + ".");
    }
}
