import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Jumlah {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\halim\\Downloads\\POLINEMA\\SEMESTER 3\\PEMROGRAMAN BERBASIS OBJEK\\PERTEMUAN 1. REVIEW JAVA\\Tugas1\\Tugas\\src\\piramida.txt";

        // Representasi lokasi file yang akan dibaca
        File file = new File(
                "C:\\Users\\halim\\Downloads\\POLINEMA\\SEMESTER 3\\PEMROGRAMAN BERBASIS OBJEK\\PERTEMUAN 1. REVIEW JAVA\\Tugas1\\Tugas\\src\\Jumlah.txt");

        // Menggunakan try with resource statement
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            // Untuk mengambil baris data yang ada pada File
            String barisData;

            // Menampilkan semua baris data didalam file contohFile.txt
            while ((barisData = br.readLine()) != null) {
                System.out.println(barisData);
            }

            // Digunakan untuk menangani kesalahan jika terjadi error
        } catch (FileNotFoundException ex1) {

            // Menangani kesalahan jika file tersebut tidak ditemukan
            System.out.println("File tidak ditemukan " + file.toString());

        } catch (Exception ex2) {
            // Menangani kesalahan jika file tersebut tidak dapat dibaca
            System.out.println("File tidak dapat dibaca " + file.toString());

        }

    }
}
