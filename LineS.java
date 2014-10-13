package lines;

import java.util.Scanner;
import java.util.Random;

public class LineS {

    public static void main(String[] args) {

        int index = -1;
        int key = 0;
        int size = 0;
        Scanner scanner = new Scanner(System.in);
        Random gen = new Random();

        System.out.println("Enter size mas");
        if (scanner.hasNextInt()) {
            size = scanner.nextInt();
        }

        System.out.println("MAS: ");
        int mas[] = new int[size];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = gen.nextInt(10) - 2;
            System.out.print(mas[i] + " ");
        }

        System.out.println("\nEnter key search");
        if (scanner.hasNextInt()) {
            key = scanner.nextInt();
        }

        for (int i = 0; i < mas.length; i++) {
            if (key == mas[i]) {
                index = i;
                System.out.println("Index key mas[" + index + "]" + "= " + mas[index]);
                break;
            }
        }
        if (index == -1) {
            System.out.println("ERROR");
        }

    }

}
