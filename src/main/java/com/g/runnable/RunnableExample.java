package com.g.runnable;

public class RunnableExample {
    public static void main(String args[])
    {
        Thread myThread = new Thread(()->System.out.println("Printed inside runnable Oam vigneswara"));
        myThread.run();
    }
}
