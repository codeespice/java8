package com.g.coding;

import java.util.Arrays;

public class CoinsDynamicProgramming {
    public static void main(String[] args)
    {
       int[] coins={7,2,3,6};
       int total=13;
     int res=   minimumCoinBottomUp(total,coins);
       System.out.println(res);
    }

    private static int minimumCoinBottomUp(int total,int[] coins)
    {

        int T[] = new int[total+1];
        int R[] = new int[total+1];

        for(int i=1;i<=total;i++)
        {
            T[i] =Integer.MAX_VALUE-1;
            R[i]=-1;
        }
        for(int j=0;j<coins.length;j++)
        {
            for(int i=1;i<=total;i++) {
                if (i >= coins[j]) {
                    if (T[i - coins[j]] + 1 < T[i]) {
                        T[i] = T[i - coins[j]] + 1;
                        R[j] = j;
                    }
                }
            }
        }
        return T[total];
    }
}
