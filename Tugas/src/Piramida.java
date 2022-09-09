import java.io.FileNotFoundException;
import java.util.Formatter;

public class Piramida {
    public static void main(String[] args) {
        try (Formatter file = new Formatter(
                "C:\\Users\\halim\\Downloads\\POLINEMA\\SEMESTER 3\\PEMROGRAMAN BERBASIS OBJEK\\PERTEMUAN 1. REVIEW JAVA\\Tugas1\\Tugas\\src\\piramida.txt")) {

            // Menulis data baru pada file yang bersangkutan
            int[] nim = { 2, 1, 4, 1, 7, 6, 2, 1, 2, 2 };

            int i = 1;
            int temp = 0;
            while (i <= 4) {
                int k = 4;
                while (k > i) {
                    System.out.print(" ");
                    file.format("%s", " ");
                    k--;
                }

                int j = 0;
                while (j < i) {
                    System.out.print(nim[temp] + " ");
                    file.format("%s", nim[temp] + " ");

                    temp++;
                    j++;
                }
                System.out.println();
                file.format("%s %n", " ");
                i++;
            }

        } catch (FileNotFoundException ex) {
            // Menampilkan pesan jika file tidak ditemukan
            System.out.println("File Tidak Ditemukan");
        }
    }

}
