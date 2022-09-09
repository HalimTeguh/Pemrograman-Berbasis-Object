
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author halim
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("=====================");
        System.out.println("Tugas PBO Review Java");
        System.out.println("=====================\n");

        System.out.println("Nama\t\t: Halim Teguh Saputro");
        System.out.println("Nim\t\t: 2141762122");
        System.out.println("No Absen\t: 08 (Genap)\n\n");

        int[] nim = { 2, 1, 4, 1, 7, 6, 2, 1, 2, 2 };
        Soal1 data = new Soal1(nim);
        Soal2 data2 = new Soal2(nim);
        System.out.println("Menggambar Segitiga Sama Kaki menggunakan NIM (WHILE)");
        data.segitiga();
        System.out.println();

        System.out.println("Menghitung Jumlah nilai dari NIM (FOR)");
        System.out.println("Total Nilai\t: " + data2.Jumlah());

    }

}
