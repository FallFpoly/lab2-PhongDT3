/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab2;

import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class bai3 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double tien,dien;
        System.out.print("Nhap so dien: ");
        dien=sc.nextDouble();
        if (dien<=50) {
            tien=dien*1000;
        } else {
            tien=50*1000+(dien-50)*1200;
        }
        System.out.println("So tien phai tra la: "+tien);
    }
}
