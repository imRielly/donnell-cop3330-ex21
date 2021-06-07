/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Rielly Donnell
 */

package oop.example;

import java.util.Scanner;

/**
 Exercise 21 - Numbers to Names
 Many programs display information to the end user in one form but use a different form inside the program.
 For example, you may show the word Blue on the screen, but behind the scenes you’ll have a numerical value
 for that color or an internal value because you may need to represent the textual description in another
 language for Spanish-speaking visitors.

 Write a program that converts a number from 1 to 12 to the corresponding month.
 Prompt for a number and display the corresponding calendar month,
 with 1 being January and 12 being December.
 For any value outside that range, display an appropriate error message.

 Example Output
 Please enter the number of the month: 3
 The name of the month is March.

 Constraints
 Use a switch or case statement for this program.
 Use a single output statement for this program.
 Challenges
 Use a map or dictionary to remove the switch statement from the program.
 Support multiple languages. Prompt for the language at the beginning of the program.
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the number of the month: ");
        int monNo = in.nextInt();
        String month;
        switch (monNo) {
            case 1:
                month = "The name of the month is January";
                break;
            case 2:
                month = "The name of the month is February";
                break;
            case 3:
                month = "The name of the month is March";
                break;
            case 4:
                month = "The name of the month is April";
                break;
            case 5:
                month = "The name of the month is May";
                break;
            case 6:
                month = "The name of the month is June";
                break;
            case 7:
                month = "The name of the month is July";
                break;
            case 8:
                month = "The name of the month is August";
                break;
            case 9:
                month = "The name of the month is September";
                break;
            case 10:
                month = "The name of the month is October";
                break;
            case 11:
                month = "The name of the month is November";
                break;
            case 12:
                month = "The name of the month is December";
                break;
            default:
                month = "The number you entered does not correlate with a month.";
                break;
        }
            System.out.println(month);
        }
    }

