import java.util.Scanner;
public class Siakad01 {
    public static void main(String[] args) {

    Scanner sc = new Scanner (System.in);

    String nama, nim;
    char kelas;
    byte absen;
    double nilaiKuis, nilaiTugas, nilaiUjian, Nilai-Akhir;
    
    System.out.print("Masukkan nama: ");
    nama = sc.nextLine();
    System.out.print("Masukkan NIM: ");
    nim = sc.nextLine();
    System.out.print("Masukkan kelas: ");
    kelas = sc.nextLine();
    System.out.print("Masukkan nomor absen: ");
    absen = sc.nextByte();

    System.out.print("Masukkan nilai kuis: ");
    nilaiKuis = sc.nextDouble();
    System.out.print("Masukkan nilai tugas: ");
    nilaiTugas = sc.nextDouble();
    System.out.print("Masukkan nilai ujian: ");
    nilaiUjian = sc.nextDouble();

    nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) / 3;

   System.out.print("Mahasiswa dengan nama " + nama + " (NIM " + nim + ")");
   System.out.print(" kelas " + kelas + " Absen " + absen);
   System.out.print(" Nilai-Akhir " + Nilai-Akhir);

    }
}