/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab2;

import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class bai2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a,b,c,x,x1,x2,delta;
        System.out.print("Nhap a: ");
        a=sc.nextDouble();
        System.out.print("Nhap b: ");
        b=sc.nextDouble();
        System.out.print("Nhap c: ");
        c=sc.nextDouble();
        if (a==0) {
            System.out.println("Day la PT bac 1");
            if (b==0) {
                if (c==0) {
                System.out.println("PT co vo so nghiem");
            } else {
                System.out.println("PT vo nghiem");
            }
            } else {
                x=-c/b;
                System.out.println("Nghiem cua PT la: "+x);
            }
        } else {
            delta=Math.pow(b, 2)-4*a*c;
            if (delta==0) {
                System.out.println("PT co nghiem kep: x="+(-b/(2*a)));
            } else if (delta > 0) {
                x1=(-b+Math.sqrt(delta))/(2*a);
                x2=(-b-Math.sqrt(delta))/(2*a);
                System.out.println("PT co 2 nghiem phan biet x1="+x1+" va x2="+x2);
            } else {
                System.out.println("PT vo nghiem");
            }
        }
    }
}
