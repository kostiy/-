package bins;

import java.util.Scanner;

public class BinS {
    
    public static int key = 0;
     static int mas[];
    
    public static void bin(int r, int l, int m){
       
            
                if (key == mas[m]) {
                    System.out.println("mas[" + m + "]= " + mas[m]);
                    return;
                }
                if (r == l) {
                    System.out.println("ERROR NOT FOUND!!!");
                    return;
                } else if (key < mas[m]) {
                    System.out.println("key < m " + l + " " + m + " " + r);
                    r = m - 1;
                    m = (r + l) / 2;
                } else {
                    System.out.println("k > m " + l + " " + m + " " + r);
                    l = m + 1;
                    m = (r + l) / 2;
                }
     bin(r,l,m);       
    }
        
                    

    public static void main(String[] args) {

        int m = 0;
        int l, r, size = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter key search");
        if (sc.hasNextInt()) {
            key = sc.nextInt();
        }

        System.out.println("Enter size mas");
        if (sc.hasNextInt()) {
            size = sc.nextInt();
            m = size / 2;
        }

      mas = new int[size];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = i * i;
            System.out.println("mas[" + i + "]= " + mas[i]);
        }

        System.out.println("Loading bin search");

        m = (mas.length - 1) / 2;

        l = 0;
        r = mas.length - 1; //pow(2,"nie kostil);
        if(r !=-1){bin(r,l,m);} else
        System.out.println("ERROR SIZE MAS");
     

    }

}
