package com.sda.algorytmy;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int licznik =0;

        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
            licznik++;
        }

        System.out.println("Liczba iteracji:" +licznik);
        System.out.println("NWD:" + a);
    }
}