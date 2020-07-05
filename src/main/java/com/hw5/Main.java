package main.java.com.hw5;

import main.java.com.hw5.generic.MyList;

public class Main {

    public static void main(String[] args) {

        MyList<Integer> myList = new MyList<>();
        myList.add(15);
        myList.add(19);
        myList.add(5);
        myList.add(30);
        myList.add(122);
        myList.add(12);

        System.out.println("Min value = " + myList.printMinValue());
        System.out.println("Max value = " + myList.printMaxValue());
    }
}
