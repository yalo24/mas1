package com.company;

import java.util.Random;

public class mas2 {
    public static void main(String[] args) {
        int[][] mas = new int[5][5];
        int[] min = new int[25];

        Random random = new Random();
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                mas[i][j] = random.nextInt(10);
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
      /*  for (int k = 0; k < min.length; k++) {*/
        int k = 0;
            for (int i = 0; i < mas.length; i++) {
                min[k] = mas[i][0];
                for (int j = 0; j < mas.length; j++) {
                    min[k] = mas[i][j];
                    System.out.print(min[k] + " ");
                    k++;
                }

            }

        //}
    }
}

