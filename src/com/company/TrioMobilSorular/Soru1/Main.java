package com.company.TrioMobilSorular.Soru1;

public class Main {

    public static void main(String[] args) {

        // dizi icerisindeki arkadas olmayan degerler ile dizinin alt kumesi olan degerler toplanir.
        // max degeri olan doner.

        int arr[] = new int[]{-5,2,-1,8,-2};

        int maxSumIncludePrev = arr[0];
        int maxSumExcludePrev = 0;
        int maxSumExcludePrevNew;

        for (int i = 1; i < arr.length; i++)
        {
            if(maxSumIncludePrev > maxSumExcludePrev){
                maxSumExcludePrevNew=maxSumIncludePrev;
            }
            else{
                maxSumExcludePrevNew=maxSumExcludePrev;
            }
            maxSumIncludePrev = maxSumExcludePrev + arr[i];
            maxSumExcludePrev = maxSumExcludePrevNew;
        }

        if(maxSumIncludePrev > maxSumExcludePrev){
            System.out.println(maxSumIncludePrev);
        }
        else{
            System.out.println(maxSumExcludePrev);
        }
    }
}
