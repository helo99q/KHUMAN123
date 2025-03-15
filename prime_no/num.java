package prime_no;
import java.util.*;
public class num {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number =scanner.nextInt();
        if(isPrime(number)){
            System.out.println(number +"is prime number. ");
        }
        else{
            System.out.println(number +"not prime number. ");
        }
  }
