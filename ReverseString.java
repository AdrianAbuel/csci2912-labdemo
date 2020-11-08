import java.util.*;

public class ReverseStringRecursion {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Input a String to be displayed in \"REVERSE\"");
        String user = input.nextLine();
           
        System.out.print("The reverse of your String is: ");
        reverseRecursion(user); //Calls the recursion method to display the reverse String
    }
    
    //recusion method that reverses a String text
    public static void reverseRecursion(String text) {      
        
        //The code below is what I got that reverses the String text but for some reason it was giving me a StringIndexOutOfBoundsException 
        //https://examples.javacodegeeks.com/java-basics/exceptions/java-lang-stringindexoutofboundsexception-how-to-solve-stringindexoutofboundsexception/
        //^^^I used this resource to find out why I was getting the Exception
        /*
            int amount = text.length() - 1;  
            System.out.print(text.charAt(amount)); 
        
            return reverseRecursion(text.substring(0, amount));
        */
        
        
        //After researching, this is what I got
        int amount = text.length(); //integer amount that finds the lenght of the String text inputted by the user
        /*  
            When the recursion reaches text.lenght = 0 it does not keep subtracting 
            to get a StringIndexOutOfBounds since it is already on the last value of
            the string it might as well display it as a normal String text
        */
        if(amount <= 0)//To fix the StringIndexOutOfBounds I placed a "limit" that stops the recursion from substracting so if its already at the beginning of the letter it displays it as normal
        {
            System.out.println(text);
        }
        else
        {
            System.out.print(text.charAt(amount - 1));//We take the char of the last digit of every string
            reverseRecursion(text.substring(0, amount - 1));
            //Recusion method that takes the end of a string and displays the text from (0--> which is the beginning of the String, to the end of the string)
        }    
    }
    
}

