package com.company.TrioMobilSorular.Soru2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // baslangic, bitis, bolen degeri kullanicidan alinir.
        // baslangic degeri ile bitis degeri arasindaki bolen
        // sayisina bolunebilen butun sayilar toplanir.


        Scanner scanner = new Scanner(System.in);

        int startValue = scanner.nextInt();
        int endValue = scanner.nextInt();
        int valueOfDivide = scanner.nextInt();

        System.out.println(startValue + " sayisindan " + endValue + " sayisina kadar " + valueOfDivide + " degerine bolunen sayılarin");
        System.out.println("toplam degeri : " + getSumOfAllDivisor(startValue, endValue, valueOfDivide));

    }

    private static int getSumOfAllDivisor(int startValue, int endValue, int valueOfDivide) {

        int sumOfAllDivisor = 0;
        for (int i = startValue; i < endValue; i++) {

            if (i % valueOfDivide == 0)
                sumOfAllDivisor += i;
        }
        return sumOfAllDivisor;
    }
}
