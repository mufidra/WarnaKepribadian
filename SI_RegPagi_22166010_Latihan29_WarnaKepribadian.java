/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si_regpagi_22166010_latihan29_warnakepribadian;

import java.util.Scanner;

/**
 *
 * @author ACER
 * NAMA : Mufida Anggradita
 * KELAS : PBO29
 * NIM : 22166010
 * DESKRIPSI PROGRAM : Warna Kepribadian
 */
public class SI_RegPagi_22166010_Latihan29_WarnaKepribadian {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\u001b[31mYUK \u001b[32mCEK \u001b[33mKEPRIBADIANMU \u001b[36mDARI \u001b[35mWARNA \u001b[34mFAVORITMU \u001b[0m \n");
        
        System.out.println("\u001b[41m      MERAH       \u001b[0m");
        System.out.println("\u001b[42m      HIJAU       \u001b[0m");
        System.out.println("\u001b[43m      KUNING      \u001b[0m");
        System.out.println("\u001b[44m      BIRU        \u001b[0m");
        System.out.println("\u001b[45m      UNGU        \u001b[0m\n");
        
        System.out.print("PILIH WARNA FAVORITMU : ");
        String warna = scanner.next();
        System.out.print("NAMA KAMU : ");
        String nama = scanner.next();
        
        
        System.out.println("\n====HASIL TEST KEPRIBADIAN " + nama +"====");
        System.out.print("Warna favoritmu adalah ");
        
            switch (warna) {
            case "merah":
                System.out.println("\u001b[31m merah \u001b[0m");
                System.out.println("""
                                   1. Periang,
                                   2. Pemberani,
                                   3. Berani menyukai risiko dalam setiap langkah,
                                   4. Menyukai tantangan,
                                   5. Kurang sabar,
                                   6. Dapat menahan marah namunn jika sudah tahap puncak toleransi, kemarahannya akan sulit dikontrol,
                                   7. Memiliki energi kehangatan dan cinta.""");
                break;
            case "hijau":
                System.out.println("\u001b[32m hijau \u001b[0m");
                System.out.println("""
                                   1. Romantis,
                                   2. Menyukai hal yang berbau alami dan keindahan,
                                   3. Teguh pada prinsip,
                                   4. Mudah cemburu,
                                   5. Mudah merasa iri,
                                   6. Menjunjung tinggi suatu nilai toleransi dan kepercayaan.""");
                break;
            case "kuning":
                System.out.println("\u001b[33m kuning \u001b[0m");
                System.out.println("""
                                   1. Optimis,
                                   2. Suka bergaul,
                                   3. Periang,
                                   4. Senang menolong,
                                   5. Lincah dan aktif,
                                   6. Tidak suka meremehkan kekurangan orang lain,
                                   7. Loyal,
                                   8. Hangat,
                                   9. Meskipun cenderung optimis dan idealis, seringkali goyah dan tidak stabil,
                                   10.Cenderung penakut.""");
                break;
            case "biru":
                System.out.println("\u001b[34m biru \u001b[0m");
                System.out.println("""
                                   1. Menyenangkan,
                                   2. Bijaksana,
                                   3. Pembawaan diri tenang saat menghadapi masalah,
                                   4. Dinamis,
                                   5. Senang berbagi,
                                   6. Bersahabat,
                                   7. Tidak terlalu suka menjadi sorotan banyak orang,
                                   8. Menyembunyikan perasaan karena karakternya yang cenderung mencari damai.""");
                break;
            case "ungu":
                System.out.println("\u001b[35m ungu \u001b[0m");
                System.out.println("""
                                   1. Optimis,
                                   2. Tidak pernah ragu,
                                   3. Menurutnya pasangan yang ideal adalah yang memiliki mental yang kuat,
                                   4. Memiliki ambisi yang besar,
                                   5. Memiliki empati yang besar,
                                   6. Memiliki sisi misterius sebab seringkali menutupi perasaannya,
                                   7.Terkadang bersikap keras kepala dan angkuh""");
                break;
            default:

                System.out.println("Warna yang Anda masukkan tidak valid.");
                break;

    }

    }
    
}
