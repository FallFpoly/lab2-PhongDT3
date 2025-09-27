/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab2;

import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class bai4 {
    private static String[] args;
    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
        Scanner sc=new Scanner(System.in);
        int cn;
        do {
        System.out.println("+---------------------+");
        System.out.println("| DANH SACH CHUC NANG |");
        System.out.println("+---------------------+");
        System.out.println("| 1: Giai PT bac 1    |");
        System.out.println("| 2: Giai PT bac 2    |");
        System.out.println("| 3: Tinh tien dien   |");
        System.out.println("| 0: Ket thuc         |");
        System.out.println("+---------------------+");
        System.out.print("CHON CHUC NANG: ");
        cn=sc.nextInt();
        switch (cn){
            case 1:
                System.out.println("Ban chon: Giai PT bac 1");
                bai1.main(args);break;
            case 2:
                System.out.println("Ban chon: Giai PT bac 2");
                bai2.main(args);break;
            case 3:
                System.out.println("Ban chon: Tinh tien dien");
                bai3.main(args);break;
            case 0:
                System.out.println("Thoat ung dung");
                break;
            default:
                System.out.println("Chon sai. Vui long chon lai (1-4)");
                break;
        }
        } while(cn!=0);
    }
}
    
