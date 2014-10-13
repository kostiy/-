package fibo;

import java.math.BigInteger;

public class Fibo {

    private BigInteger f1 = new BigInteger("0");
    private BigInteger f2 = new BigInteger("1");
    private BigInteger temp = new BigInteger("0");
    int sh = 0;
    private int step = 0;
    private int p = 0;

    Fibo() {
        step = 10;
        p = 1;
    }

    Fibo(int step, int p) {
        this.step = step;
        this.p = p;
    }

    public void setP(int p) {
        this.p = p;
    }

    public int getP() {
        return p;
    }

    public void setStep(int step) {
        this.step = step;
    }

    public int getStep() {
        return step;
    }

    public void rfibo(int step, BigInteger f1, BigInteger f2) {

        temp = f2.add(f1);
        f1 = f2;
        f2 = temp;

        if (step == sh) return;
        System.out.println(sh++ + " -> " + f2.toString() + " ");
        rfibo(step, f1, f2);

    }

    public void gen(int step, int p) {

        switch (p) {
            case 0: {
                System.out.println("Fibonacci\n");
                System.out.println("0" + " -> " + f1.toString() + " ");
                System.out.println("1" + " -> " + f2.toString() + " ");
                for (int i = 2; i <step; i++) {

                    temp = f2.add(f1);
                    f1 = f2;
                    f2 = temp;
                    System.out.println(i + " -> " + f2.toString() + " ");
                    //  if (i % 10 == 0) 
                    //    System.out.print("\n");
                }
            }
            break;

            case 1: {
                System.out.println("Fibonacci\n");
                System.out.println(sh++ + " -> " + f1.toString() + " ");
                System.out.println(sh++ + " -> " + f2.toString() + " ");
                // while (jk != ) {

                rfibo(step, f1, f2);
                //}
            }
        }

    }

}
