package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double t = sc.nextDouble();
        double n = t%5;
        if (n >= 0 && n < 3 )
            System.out.println("зелёный");
        if (n >= 3  && n < 4 )
            System.out.println("желтый");
        if (n >= 4  && n < 5 )
            System.out.println("красный");

    }
}