import java.lang.Math;
import java.util.Scanner;


public class Backward {

    public static void main(String[] args){

        // gets inputs from users
        // stores them as number1 and number2
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please the first integer");
        int number1 = scanner.nextInt();

        System.out.println("Please enter the second integer:");
        int number2 = scanner.nextInt();

        // create a temp var called T
        int T;

        // checks the greatest value between number1 and number2
        //assigns T to number if T is the greatest value
        if (number1 < number2){
            T =number1;
        }
        else {
            T = number2;
        }


        //Iteration goes through all the numbers and prints the GCD
        for (int i = 2; i <= number1 && i <= number2; i++ ){

            if (number2 % T ==0){

                if (number1 % T == 0){
                    System.out.println(+T);
                }
                else {
                    T = T-1;
                }

            }
           else {
               T = T-1;
            }

        }
        return;





    }


