/*This program wil generate a random number and compares it with the users number*/
import java.util.Scanner;
public class GuessingGame {
 public static void main(String [] args ){
     Scanner sc = new Scanner (System.in);
     System.out.println("I am thinking about a number between 1 and 10...");
     int random = (int) ((Math.random()*10)+1);
     int guess = sc.nextInt();
     System.out.println(random+"<--");
     if (guess > 10){
         System.out.println("Sorry number is above 10.");
     }
     else{
         if (random > guess){
             System.out.println("Sorry it's too high");
         }
         else if (random < guess){
             System.out.println("Sorry it's too low");
         }
         else if (random == guess){
             System.out.println("Good job, you got it");
         }
     }
 }

}
