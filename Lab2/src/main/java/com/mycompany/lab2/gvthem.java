/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab2;

import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class gvthem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a,b,c;
        System.out.print("Nhap a: ");
        a=sc.nextDouble();
        System.out.print("Nhap b: ");
        b=sc.nextDouble();
        System.out.print("Nhap c: ");
        c=sc.nextDouble();
        System.out.println("So lon nhat trong 3 so la: "+Math.max(Math.max(a, b),c));
    }
}
