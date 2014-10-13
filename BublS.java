package bubls;

import java.util.Scanner;
import java.util.Random;

public class BublS {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random gen = new Random();
        int size = 0;
        int mas[];

        System.out.println("Enter size mas");

        if (sc.hasNextInt()) {
            size = sc.nextInt();
        }

        System.out.println("Print mas[" + size + "]");
        mas = new int[size];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = gen.nextInt() % 10;
            System.out.println("mas[" + i + "]= " + mas[i]);
        }
        System.out.println("Print bubl sort mas[" + mas.length + "]");
        long t1 = System.nanoTime();
        for (int i = mas.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (mas[j] > mas[j + 1]) {
                    int temp = mas[j];
                    mas[j] = mas[j + 1];
                    mas[j + 1] = temp;
                }
            }
        }
        long t2 = System.nanoTime() - t1;
        System.out.println("TiemSORT  =  " + t2);
        for (int i = 0; i < mas.length; i++) {
            System.out.println("mas[" + i + "]= " + mas[i]);
        }
    }

}
