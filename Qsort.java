/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qsort;

import java.util.Random;
import java.util.Scanner;

public class Qsort {

    public int mas[];
    public int size;
    public int i, j, temp;
    public Random gen = new Random();
    

    Qsort() {
        size = 10;
       mas = new int[size];
    }

    Qsort(int s) {
        size = s;
       mas = new int[size];
    }

    public void imas() {
        for (int i = 0; i < size; i++) {
            mas[i] = gen.nextInt(10) - 1; 
        }
    }

    public void omas() {
        for (int i = 0; i < size; i++) {
            System.out.println("mas[" + i + "]" + " = " + mas[i]);
        }
    }

    public void quickSort() {
        int startID = 0;
        int endID = size - 1;
        doSort(startID, endID);
    }

    public void doSort(int l, int r) {
        if (l >= r) {
            return;
        }

        int i = l, j = r;
        int cur = (i + j) / 2;

         while (i < j){
            while (i < cur && (mas[i]) <= mas[cur]) {
                i++;
            }
            while (j > cur && (mas[cur] <= mas[j])) {
                j++;
            }if(i<=j){
            int temp = mas[i];
            mas[i] = mas[j];
            mas[j] = temp;}
        }
        doSort(l, i);
        doSort(j, r);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size mas");
        int s;
        s = sc.nextInt();
        Qsort q = new Qsort(s);
        System.out.println("Prit mas to quick sort");
        q.imas();
        q.omas();
        long t1 = System.nanoTime();
        q.quickSort();
        long t2 = System.nanoTime() - t1;
        System.out.println("Prit mas to quick sort of time"+t2);
        q.omas();
    }

}
