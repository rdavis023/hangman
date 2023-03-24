/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hangmantester;



 /*
 * @author Rahshann
 */
public class HangmanPick {
    //private and public variables declared
    String randWord;
    private String[] newList; 
    int guesses;
    char [] wordChar;
    private boolean foundWord = false;
    
    /*Two constructors lines 20-27, one for the array and the other: default
     *for guesses
    */
    public HangmanPick(String[] words){
        newList = words;
    }
    
    public HangmanPick(){
        guesses = 0;
    }
   
    /*Method to randomize the word attained from array then putting into another
    * another array full of asterisks
    */
    public void setRandomWord(){
       
        int arrayLength = newList.length;
           
        int rand1 = (int)(Math.random() * arrayLength);
       
        randWord = newList[rand1];
       
        wordChar = new char[randWord.length()];
      
        for(int i = 0; i < randWord.length(); i++){
        wordChar[i] = '*';
        }
            System.out.println(wordChar);
    }
    //A method to get the random Word  
    public String getsetWord(){
        return randWord;
    }
    
    /*Method for judging the user input Letter to see if it matches random word
     *Returning whether or not the input is correct or incorrect
    */
    public void judgeLetter(String userLetter){
       
        for(int i = 0; i < randWord.length(); i++){
            if(randWord.substring(i, i+1).equals(userLetter)){
                wordChar[i] = userLetter.charAt(0);
                
                foundWord = true;    
            }
            else{
               
            }    
        }
        
            if(foundWord == true){
                System.out.println("YOU GUESSED A LETTER RIGHT!!");
                System.out.println();
                System.out.println(wordChar);
                guesses++;
            }
         
            else{
                System.out.println("YOU GUESSED A WRONG LETTER!!");
                System.out.println();
                System.out.println(wordChar);
                guesses++;
            }
       
            
    }
    
 
    

}
    
    
      
           
      
        
        
    
    
   

