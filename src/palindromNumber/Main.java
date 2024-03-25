package palindromNumber;

import java.util.Scanner;




public class Main {

    static boolean isPalindrom(int number){

        int tempNumber = number,reverseNumber = 0;

        while(tempNumber != 0){

            int residue = tempNumber%10;

            reverseNumber = reverseNumber *10 + residue;

            tempNumber /= 10 ;


            }
        if (number == reverseNumber){
            return true;
        }
        else {
            return false;



        }



    }
    public static void main(String[] args) {

        System.out.println("Bir sayı giriniz ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        boolean cond = isPalindrom(number);

        if(cond){

            System.out.println("Number is palindrom number");
        }
        else {
            System.out.println("Number is not palindrom number ");
        }





    }
}
