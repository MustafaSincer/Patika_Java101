package Armstrong;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int number,basNumber,tempNumber,basValue ;
        int total = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz :");
        number = input.nextInt();
        tempNumber = number;
        basNumber = 0;
        // Basamak sayısını bulma
        while(tempNumber!=0){

            tempNumber=tempNumber/10;
            basNumber++;
        }
        System.out.println("Basamak sayısı :" +basNumber);
        // Basamak değerlerini elde etme
        tempNumber = number;
        while(tempNumber!=0){
            basValue = tempNumber % 10;


                total += basValue;


            tempNumber = tempNumber/10;

        }

        System.out.println("Basamakların toplamı :"+ total);

    }
}
