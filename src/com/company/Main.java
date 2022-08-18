package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        //Ex1
        /*
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(Math.sqrt(a*a+b*b));
        */
        //Ex2
        /*
        Scanner sc =new Scanner(System.in);
        int numb = sc.nextInt();
        System.out.printf("The next number for the number %d is %d\n",numb,numb+1);
        System.out.printf("The previous number for the number %d is %d.",numb,numb-1);
        */
        //Ex3
        /*
        Scanner sc =new Scanner(System.in);
        int children = sc.nextInt();
        int apples = sc.nextInt();
        System.out.println(apples/children);
        */
        //Ex4
        Scanner sc =new Scanner(System.in);
        int children = sc.nextInt();
        int apples = sc.nextInt();
        System.out.println(apples%children);
    }
}
