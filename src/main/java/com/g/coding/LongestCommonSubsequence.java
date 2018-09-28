package com.g.coding;

public class LongestCommonSubsequence {
    public static void main(String[] args)
    {
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";
        char[] X=s1.toCharArray();
        char[] Y=s2.toCharArray();
        int m = X.length;
        int n = Y.length;
        System.out.println(getLcs(X,Y,m,n));
    }

    public static int getLcs(char[] x,char[] y,int m , int n)
    {
        if(m==0||n==0)
        {
            return 0;

        }
        if(x[m-1] ==y[n-1])
        {
            return 1+getLcs(x,y,m-1,n-1);
        }
        else
        {
            return max(getLcs(x,y,m-1,n),getLcs(x,y,m,n-1));
        }
    }
    public static int max(int a , int b)
    {
        return (a>b)?a:b;
    }
}
