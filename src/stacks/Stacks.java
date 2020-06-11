/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stacks;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Peter
 */
public class Stacks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*
        Stack plates = new Stack();      
 
        for (int i = 1; i <= 10; i++) {
            plates.push(i);
        }
        
        System.out.println(plates);
        
        while ( !plates.empty()){
            System.out.println("\nThe next value is: " + plates.peek());
            System.out.print("The value removed is: " + plates.pop());
            
            System.out.print(",");
        }
        System.out.println("\nLIFT-OFF!!!!");
        System.out.println("\nList is empty?: " + plates.isEmpty());
        */
        
        // UndoFunction
        /*
        Create a program that accepts a set of directions from the user using Scanner as a set of strings entered one at a time. Use the stack data structure to store directions. 
        Print the list of directions every time the new direction is added. 
        If the user types in "U", the last entered direction should be removed and the updated list of directions should be displayed to the user. Make sure that the user is informed when they try to remove the direction from the empty list.   
        Look at the sample output below:

        Press D to enter new direction, U to cancel last entry and E to quit the program

        D

        Type in the direction

        Turn Right

        LIST OF DIRECTIONS: 

        Turn Right

        Press D to enter new direction, U to cancel last entry and E to quit the program

        D

        Type in the direction

        Go straight for 30 meters

        LIST OF DIRECTIONS: T

        Turn Right

        Go straight for 30 meters

        Press D to enter new direction, U to cancel last entry and E to quit the program

        U

        "Go straight for 30 meters" has been removed from the directions list

        LIST OF DIRECTIONS: 

        Turn Right

        Press D to enter new direction, U to cancel last entry and E to quit the program

        E

        Bye...
        
        */
        
        Scanner sc = new Scanner(System.in);
        String input = "";
        
        Stack<String> directions = new Stack<>();
        
        boolean quit = false;
        
        while(! quit){

            System.out.println("\nPress D to enter new direction, U to cancel last entry and E to quit the program\n");
            input = sc.nextLine();
            switch( input.toLowerCase() ){
                case "d":
                    System.out.println("\nType in the direction\n");
                    input = sc.nextLine();
                    directions.push(input);
                    System.out.println("\nLIST OF DIRECTIONS:");
                    for( String each : directions){
                        System.out.println(each);
                    }
                    break;
                case "u":
                    if( ! directions.empty() ){
                        System.out.println("\n" + '"' + directions.pop() + '"' + "has been removed from the directions list");
                    } else {
                        System.out.println("\nNo directions added yet?");
                    }
                    break;
                case "e":
                    quit = true;
                    break;
            }
        }
        
        System.out.println("\nBye...");

        
        
        
    }
    
}
