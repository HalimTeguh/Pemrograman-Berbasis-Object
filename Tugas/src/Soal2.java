/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author halim
 */
public class Soal2 {
    int[] nim;
    int total;

    Soal2(int[] nim) {
        this.nim = nim;
    }

    public int Jumlah() {
        for (int i = 0; i < nim.length; i++) {
            total += nim[i];
        }
        return total;
    }
}
