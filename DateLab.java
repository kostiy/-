package datelab;

import java.util.Scanner;

public class DateLab {

    public static void main(String[] args) {

        int d = 0, m = 0, y = 0;
        Date d0 = new Date();
        System.out.print("Print D0");
        d0.printDate(); //(1) вывожу данные созданные конструктором по умолчанию

        Scanner sc = new Scanner(System.in); //(2)Ввожу с клавиатуры данные 

        System.out.println("Enter to day");
        if (sc.hasNextInt()) {
            d = sc.nextInt();
        }
        System.out.println("Enter to month");
        if (sc.hasNextInt()) {
            m = sc.nextInt();
        }
        System.out.println("Enter to year");
        if (sc.hasNextInt()) {
            y = sc.nextInt();
        }
        System.out.print("PRINT DATE D1 ");
        Date d1 = new Date(d, m, y);
        d1.printDate();
        System.out.print("Clone D1 = D2");
        Date d2 = new Date(d1);
        d2.printDate();
        System.out.print("PRINT DATE D1 after method decDate");
        d1.decDate();
        d1.printDate();
        System.out.print("PRINT DATE D1 after method incDate");
        d1.incDate();
        d1.printDate();
    }

}
