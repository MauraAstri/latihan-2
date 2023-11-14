import java.util.Scanner;

public class Tugas3 {
   public static void main(String[] args) {
      int hari_kerja, gaji, lembur, total_gaji;
      Scanner scan = new Scanner(System.in);

      System.out.println("program penggajian karyawan");

      System.out.print("Masukan jumlah hari kerja :");
      hari_kerja = scan.nextInt();
      if (hari_kerja >= 20) {
         gaji = 20 * 50000;
         lembur = (hari_kerja - 20) * 100000;
         total_gaji = gaji + lembur;

      } else {
         gaji = hari_kerja * 50000;
         lembur = 0;
         total_gaji = gaji + lembur;
      }

      // hitung total gaji
      System.out.println("Gaji = " + gaji);
      System.out.println("Lembur = " + lembur);
      System.out.println("Total_gaji = " + total_gaji);

   }

}
