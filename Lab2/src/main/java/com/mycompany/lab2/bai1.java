/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab2;

import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class bai1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a,b,x;
        System.out.print("Nhap a: ");
        a=sc.nextDouble();
        System.out.print("Nhap b: ");
        b=sc.nextDouble();
        if (a==0) {
            if (b==0) {
                System.out.println("PT co vo so nghiem");
            } else {
                System.out.println("PT vo nghiem");
            }
        } else {
            x=-b/a;
            System.out.println("Nghiem cua PT la: "+x);
        }
    }
}
