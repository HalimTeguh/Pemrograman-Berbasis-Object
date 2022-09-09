/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author halim
 */
public class Soal1 {
    int[] nim;

    Soal1(int[] nim) {
        this.nim = nim;
    }

    public void segitiga() {
        int i = 1;
        int temp = 0;
        while (i <= 4) {
            int k = 4;
            while (k > i) {
                System.out.print(" ");
                k--;
            }

            int j = 0;
            while (j < i) {
                System.out.print(nim[temp] + " ");
                temp++;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
