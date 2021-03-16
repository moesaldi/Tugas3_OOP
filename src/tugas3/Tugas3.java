/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Optimoes
 */
public class Tugas3 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        
        int guess,randomInt;
        randomInt = rand.nextInt(100);
        //System.out.println(randomInt);
        System.out.println("Guess a magic number between 0 and 100");
        do{
            System.out.print("Enter your guess : ");
            guess = input.nextInt();
            
            if(guess > randomInt){
                System.out.println("Your guess is too high\n");
            }
            else if(guess < randomInt){
                System.out.println("Your guess is too low\n");
            }
            else {
                System.out.println("Yes! The number is "+randomInt+"\n");
            }
        } while(guess != randomInt);
        
    }
    
}
