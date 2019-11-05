/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118905.latihan51.gajikariawan;
import java.util.Scanner;

/**
 *
 * @author Fitri
 * NAMA             : Anindira Dina Fitriani
 * NIM              : 10118905
 * KELAS            : IF11 Kariawan
 * Deskripsi        : Program Gaji Kariawan
 */
public class PBO11K10118905Latihan51GajiKariawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Manager m = new Manager();
        Scanner input = new Scanner(System.in);
        System.out.println("====Program Perhitungan Gaji Karyawan=====");
        System.out.print("Masukan NIK\t: ");
        m.setNik(input.nextLine());
        System.out.print("Masukan Nama\t: ");
        String nama = input.nextLine();
        m.setNama(nama);
        System.out.print("Masukan Golongan (1/2/3)\t: ");
        m.setGolongan(input.nextInt());
        System.out.print("Masukan Jabatan (Manager/Kabag)\t: ");
        m.setJabatan(input.next());
        System.out.print("Masukan Jumlah Kehadiran\t: ");
        m.setKehadiran(input.nextInt());
        System.out.println("");
        System.out.println("=====Hasil Perhitungan======");
        System.out.println("NIK\t\t: " + m.getNik());
        System.out.println("NAMA\t\t: "+m.getNama());
        System.out.println("GOLONGAN\t: "+m.getGolongan());
        System.out.println("JABATAN\t\t: "+m.getJabatan());
        System.out.println("");
        System.out.println("TUNJANGAN GOLONGAN\t\t: "+m.tunjanganGolongan(m.getGolongan()));
        System.out.println("TUNJANGAN JABATAN\t\t: "+m.tunjanganJabatan(m.getJabatan()));
        System.out.println("TUNJANGAN KEHADIRAN\t\t: " +m.tunjanganKehadiran(m.getKehadiran()));
        System.out.println("");
        System.out.println("GAJI TOTAL\t\t: "+m.gajiTotal());
    }
    
}
