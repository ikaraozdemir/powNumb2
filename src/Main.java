import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int power, number, incNumber = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Pozitif bir sayı giriniz :");
        number = input.nextInt();
        System.out.print("Pozitif üs değeri giriniz :");
        power = input.nextInt();


        if (power == 0) {
            number = 1;
        } else {
            int count = 0;
            while (count < power) {
                 incNumber *=  number;
                count++;
            }
        }
        System.out.println(incNumber);
    }
}
