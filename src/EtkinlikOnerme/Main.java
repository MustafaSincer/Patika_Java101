package EtkinlikOnerme;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sıcaklık değerini girin: ");
        int temperature = scanner.nextInt();

        if (temperature < 5) {
            System.out.println("Kayak yapmayı öneririm.");
        } else if (temperature >= 5 && temperature <= 15) {
            System.out.println("Sinema etkinliğini öneririm.");
        } else if (temperature > 15 && temperature <= 25) {
            System.out.println("Piknik etkinliğini öneririm.");
        } else {
            System.out.println("Yüzme etkinliğini öneririm.");
        }
        scanner.close();
    }
}
