package com.g.interview;

public class Finally {
    public static void main(String args[])
    {
        Finally fi = new Finally();
        int a[] = {25,100,200};
        System.out.println("result:::"+fi.getLastElement(a));
    }

    //finally without return value
   /* public int getLastElement(int[] array)
    {
        try
        {
            int[] a = array.clone();
            return a[a.length];
        }
        catch(Exception e)
        {
            System.out.println("inside  catch block");

            return 2;
        }
        finally
        {
            System.out.println("inside finally block");

        }

    }*/
    //finally without return value
   /* public int getLastElement(int[] array)
    {
        try
        {
            int[] a = array.clone();
            return a[a.length];
        }
        catch(Exception e)
        {
            System.out.println("inside  catch block");

            return 2;
        }
        finally
        {
            System.out.println("inside finally block");
            return 3;
        }

    }*/
    //finally without return value
    public int getLastElement(int[] array)
    {
        try
        {
            int[] a = array.clone();
            return a[a.length];
        }

        finally
        {
            System.out.println("inside finally block");
            return 3;
        }

    }
}
