/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hangmantester;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


 /*Rahshann Davis 01/22/2023
 * Netbeans IDE 15
 * Java 8.0.0
 * This program includes two classes a HangmanTester and HangmanPick class. The 
 * HangmanPick class is setup with constructors, getters and setter methods to 
 * store the user's letter, the asterisks, the random words, and the guesses of 
 * words. The Hangmantester class is setup to utilze the methods in HangmanPick
 * class to input user letters to decide whether or not the user wins or loses.
 * 
 */
public class HangmanTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Main method includes scanner/user input with three declared variables 29-32
        Scanner scnr = new Scanner(System.in);
        String userLetter;
        int numGuesses = 0;
        boolean nomoreGuesses = true;
        
        //Array of strings used to store the words to be randomized
        String[] wordList ={"water","camera","hamburger","bathtube","america"
            ,"apple","oranges","oatmeal","basketball","football","soccer",
            "monster"};
   
        //Object used to call methods in HangmanPick class
        HangmanPick getWord = new HangmanPick(wordList);
       
        //Intro to game, telling user to hit enter and getting random word
        System.out.println("WELCOME TO HANGMAN!!" + '\n' + "Press enter to start."
        + '\n'+ "At any point you want to stop playing type: '\'quit'\'");
        scnr.nextLine();
        System.out.println("Your word for this hangman game is: "); 
        getWord.setRandomWord();
        
       /* while loop used to allow the user to continuiously input letter to 
        * match word lines 52-60
        */
        while(getWord.guesses< getWord.randWord.length()|| numGuesses 
               == 8 ){
             
            nomoreGuesses = false;
            System.out.println("Please enter a letter to guess.");
            userLetter = scnr.nextLine();
            getWord.judgeLetter(userLetter);
            numGuesses++;        
        }   
            //if statements deciding if user won or lost    
            if(getWord.guesses == getWord.randWord.length() && !nomoreGuesses){
                nomoreGuesses = true;
                if(nomoreGuesses){
                    System.out.println("YOU WIN!!");
                }
                else{
                    System.out.println("YOU LOSE");
                }
            }
            
           
    }      
}


    

      
    
            
   
    

