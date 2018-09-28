package com.g.algorithms;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args)
    {
        int[] numbers = {29, 20, 73, 34, 64};

     //   System.out.println("before sort ");
     //   Arrays.stream(numbers).forEach(System.out::println);
       // bubbleSort(numbers);
     //   Arrays.stream(numbers).forEach(System.out::println);
      // selectionSort(numbers);
        quickSort(numbers,0,numbers.length-1);
        Arrays.stream(numbers).forEach(System.out::println);
    }
    /*
    The algorithm works by comparing each item in the list with the item next to it, and swapping them if required.
     In other words, the largest element has bubbled to the top of the array.
      The algorithm repeats this process until it makes a pass all the way through the list without swapping any items.

     */
    public static void bubbleSort( int[] numbers)
    {
        int temp=0;
        for(int i=0;i<numbers.length;i++)
        {
            for(int j=0;j<numbers.length-1;j++)
            {
                if(numbers[j]>numbers[j+1])
                {
                    temp=numbers[j+1];
                    numbers[j+1]=numbers[j];
                    numbers[j]=temp;

                }
            }

        }
        System.out.println("After bubble sort");
        Arrays.stream(numbers).forEach(System.out::println);
    }

    /*
    The algorithm works by selecting the smallest unsorted item and then swapping it with the item in the next position to be filled.
The selection sort works as follows: you look through the entire array for the smallest element, once you find it you swap it (the smallest element) with the first element of the array.
Then you look for the smallest element in the remaining array (an array without the first element) and swap it with the second element.
 Then you look for the smallest element in the remaining array (an array without first and second elements) and swap it with the third element, and so on.
  Here is an example,
     */
    public static void selectionSort( int[] numbers)
    {
        int min =0;
        int temp=0;
        int index=0;
        for(int i=0;i<numbers.length;i++)
        {
            min=numbers[i];
            index=i;
           for(int j=i;j<numbers.length;j++)
           {
               if(min>numbers[j])
               {
                   index=j;
                   min = numbers[j];
               }

           }
           temp=numbers[index];
            numbers[index]=numbers[i];
            numbers[i]=temp;
            Arrays.stream(numbers).forEach(System.out::println);
            System.out.println("******************");
        }


    }

    /*
    insertion sort intentioanlly not implemented as it is not favourable sort
     */


    /*
    Merge-sort is based on the divide-and-conquer paradigm. It involves the following three steps:
    merge will be implemented later
     */
    public static void mergeSort( int[] numbers)
    {
        if(numbers.length==1)
        {
            System.out.println(numbers[0]);
        }
        int x = numbers.length/2;
        int[] m1=Arrays.copyOfRange(numbers,0,x);
        int[] m2=Arrays.copyOfRange(numbers,x,numbers.length);
        mergeSort(m1);
        mergeSort(m2);

    }
    /*
    quick sort
    Sort algorithms order the elements of an array according to a predefined order. Quicksort is a divide and conquer algorithm. In a divide and conquer sorting algorithm the original data is separated into two parts "divide" which are individually sorted and "conquered" and then combined.
If the array contains only one element or zero elements then the array is sorted.

If the array contains more than one element then:

Select an element from the array. This element is called the "pivot element". For example select the element in the middle of the array.

All elements which are smaller than the pivot element are placed in one array and all elements which are larger are placed in another array.

Sort both arrays by recursively applying Quicksort to them.

Combine the arrays.

Quicksort can be implemented to sort "in-place". This means that the sorting takes place in the array and that no additional array needs to be created

     */

    public static void quickSort(int[] arr, int low,int high)
    {
        if(arr==null||arr.length==0)
        {
            return;
        }
        if(low>=high)
        {
            return;
        }
        int middle=low+(high-low)/2;
        int pivot = arr[middle];
        int i=low;
        int j=high;
        while(i<=j)
        {
            while(arr[i]<pivot)
            {
                i++;
            }
            while(arr[j]>pivot)
            {
                j--;
            }
            if(i<=j)
            {
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;

            }
        }
        if(low<j)
        {
            quickSort( arr,low,j);
        }
        if(high>i)
        {
            quickSort( arr,i,high);
        }
    }
}
