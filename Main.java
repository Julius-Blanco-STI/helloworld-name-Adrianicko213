
package main;
import java.util.*;
public class Main {

   
    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
       System.out.println("What's your name?");
       String name = scn.nextLine();
       System.out.println("What's your address?");
       String address = scn.nextLine();
       System.out.println("How old are you?");
       int age = scn.nextInt();
      
       System.out.println(" Hi " + name);
       System.out.println("You live in " + address);
       System.out.println("You are " + age);
       
    }
    
}
