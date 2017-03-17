package javaapplication4;

import java.util.Scanner;

public class JavaApplication4 {

    public static void main(String[] args) {
    
        System.out.println("Choose a colour: Black, White, Red, Blue");
        
        Scanner user_input = new Scanner(System.in);
        
        String fav_colour = user_input.next( );
        
        if (fav_colour.equals("Black")){
            System.out.println("You must be Goth!");
        }
        else if (fav_colour.equals("White")){
            System.out.println("Are you a very pure person?");
        }     
        else if (fav_colour.equals("Red")){
            System.out.println("You are fun and outgoing");
        }
        else if (fav_colour.equals("Blue")){
            System.out.println("You're not a Leafs fan, are you?");
        }
        else {
            System.out.println("Pick on the those four colours.");
            
        }
       }
    }
    

