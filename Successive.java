import java.lang.Math;
import java.util.Scanner;



public class Successive {

    public static void main(String[] args){


        //Reads the inputs numbers from the user
        //First integer is stored as number1 and second integer is stored as number2
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the first integer");
        int number1 = scanner.nextInt();

        System.out.println("Please enter the second integer");
        int number2 = scanner.nextInt();


        // Starts the loop and prints the result
      while(number1 != 0 && number2 !=0){

          if(number1 > number2){
              number1 =number1-number2;


          }

          else {
              number2 = number2-number1;

          }

          if (number1 == 0){
                System.out.println("the GCD is :"+number2);
            }
            if (number2 == 0){
                System.out.println("the GCD is :"+number1);
            }



        }


    }

}
