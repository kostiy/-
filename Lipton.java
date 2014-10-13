package fibo;

import java.util.Scanner;
import java.math.BigInteger;

/**
 *
 * @author root
 */
public class Lipton {

    Lipton() {
    }

    public static void main(String args[]) {
        
        int choose = 0;
        int scanner = 0;
        Scanner s = new Scanner(System.in);
        Fibo f = new Fibo();
        System.out.println("Size steps");
        reboot:
        if (s.hasNextInt()) {
            scanner = s.nextInt();
            System.out.println("Chooise type step");
            choose = s.nextInt();
        } else {
            break reboot;
        }

        f.setP(choose);
        f.setStep(scanner); // через сетер задаем кол. шагов 
        f.gen(scanner, choose);
    }
}
