/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119040.latihan17.tunjangan;

import java.util.Scanner;

/**
 *
 * @author Acer
 * Nama     : Agus Deri Dermawan
 * Kelas    : IF1
 * NIM      : 10119040
 * Program menghitung gajih bersih yng didapatkan setelah menikah
 */
public class IF110119040Latihan17Tunjangan {

    private static Object status;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double gaji, tunjangan, totalGaji;
        String Status;
        
        System.out.println("===============Program Tunjangan===============");
        System.out.print("Berapa Gaji Pokok anda perbulan ?: Rp.");
        gaji = input.nextInt();
        
        System.out.print("Status Anda? (Menikah/Belum)\t :");
        Status = input.next();
        
        if ("Menikah".equals(status)) {
            tunjangan = 0;
        } else {
            tunjangan = 0.35 * gaji;
        }
        
        totalGaji = tunjangan + gaji;
        
        System.out.println("==========Hasil Perhitungan Gaji Anda==========");
        System.out.println("Gaji Poko\t:" + gaji);
        System.out.println("Tunjangan\t:" + tunjangan);
        System.out.println("Total Gaji\t:"+ totalGaji);
        System.out.println("(Developed by : Agus Deri Dermawan)");
    }
    
}
