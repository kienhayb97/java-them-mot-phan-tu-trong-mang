package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
            if (size > 50)
                System.out.println("Size does not exceed 20");
        } while (size > 50);
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.floor(Math.random() * 100);
        }
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+"\t");
        }
        int X;
        int index;
        System.out.println("\nnhap thu vi tri muon them");
        Scanner Nhapindex = new Scanner(System.in);
        index = Nhapindex.nextInt();
        for (int i = 1; i >0  ; i++) {
            if (index < 0 || index >= size) {
                System.out.println("Vi tri nay ko co trong mang");
                System.out.println("nhap thu vi tri muon them");
                index = Nhapindex.nextInt();
            }
            else {
                break;
            }
        }

        System.out.println("nhap phan tu muon them");
        Scanner NhapX = new Scanner(System.in);
        X = NhapX.nextInt();
        int []mangMoi = new int[size+1];
        for (int i=0;i<index;i++){
           mangMoi[i] = array[i];
        }
        mangMoi[index] = X;
        for (int i=index+1;i<mangMoi.length;i++){
            mangMoi[i] = array[i-1];
        }
        for (int i=0;i<mangMoi.length;i++){
        System.out.print(mangMoi[i]+"\t");
    }
}
}
