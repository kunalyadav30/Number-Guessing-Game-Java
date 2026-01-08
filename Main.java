import java.util.Scanner;
import java.util.Random;


class Main{
public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
    Random rn=new Random();
    int magicNumber=rn.nextInt(1000);
    int triess=1;
    System.out.println("This is Game To Guess a Number Between 1 to 1000");
    System.out.println("Choose one option from below");
    System.out.println("1).Play , 2) Exit ");
    int option=sc.nextInt();
    int loopRange=1;
    switch (option) {
        case 1:
            System.out.println("Welcome To The Game, Starting The Game => ");
           do{
            int usernum=sc.nextInt();
            if(usernum<magicNumber){
                System.out.println("Your Guessed Number is Lower");
                triess++;
            }else if(usernum==magicNumber){
                 System.out.println("Your Guessed Number Correct ,You Won The Game In "+triess+ " Triess , Your Number Guessed is :"+ usernum+"Congratulations!!! ");
                 loopRange=0;
                }else{
                    System.out.println("Your Guessed Number is Higher");
                    triess++;
                }

           }while (loopRange>0);
    
            case 2:
                System.out.println("Thank For Visiting");
            break;
        default:
            System.out.println("Enter A valid Option");
            break;
    }
}}