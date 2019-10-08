package pbo1.nim10118017;

import java.util.Scanner;

/**
 *
 * @author Agung Nurhamidan
 * NAMA                 : Agung Nurhamidan
 * KELAS                : PBO1
 * NIM                  : 10118017
 * Deskripsi Program    : Menghitung total gaji dan tunjangan dari status pernikahan.
 * 
 */
public class Main {
    //Konstanta
    public static final String FOOTER = "\n(Developed by : Agung Nurhamidan)";
    
    //Variabel global
    private static double gajiPokok;
    public static String status;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("===========Program Tunjangan===========");
        inputData();
        tampilkanHasil(35);
        
        System.out.println(FOOTER);
    }
    
    //Method untuk memasukkan data
    public static void inputData() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Berapa gaji pokok anda perbulan?\t: Rp. ");
        gajiPokok = scanner.nextDouble();
        
        System.out.print("Status Anda? (Menikah/Belum)\t\t: ");
        status = scanner.next().toUpperCase();
    }
    
    //Method menampilkan hasil
    public static void tampilkanHasil(double persenTunjangan) {
        double tunjangan = 0;
        
        //Memeriksa status
        if (status.equals("MENIKAH")) {
            tunjangan = gajiPokok * (persenTunjangan / 100);
        }
        
        //Menampilkan hasil
        System.out.println("\n===========Hasil Perhitungan Gaji Anda===========");
        System.out.printf("Gaji Pokok\t\t: Rp. %.1f%n", gajiPokok);
        System.out.printf("Tunjangan\t\t: Rp. %.1f%n", tunjangan);
        System.out.printf("Total Gaji\t\t: Rp. %.1f%n", (gajiPokok + tunjangan));
    }
    
}
