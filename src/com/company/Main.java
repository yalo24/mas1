package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[][] mas = new int[5][5];
        int[] min = new int[5];
        int k = 0;
        Random random = new Random();
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                mas[i][j] = random.nextInt(10);
                System.out.print(mas[i][j] + " ");}
                System.out.println();
                }
        for (int i = 0; i < mas.length; i++) {
            min[i]=mas[i][0];
            for (int j = 0; j < mas.length; j++) {
               if (mas[i][j]<min[i] ){
                   min[i]=mas[i][j];
               }
            }
                System.out.print("min="+min[i]+" ");}
        System.out.println();
            }
        }






