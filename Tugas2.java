import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        String nama_lengkap, jurusan, gol_darah;
        int tingkat;
        Scanner scan = new Scanner(System.in);

        // imput tiap-tiap data
        System.out.println("Nama lengkap :");
        nama_lengkap = scan.nextLine();
        System.out.println("Jurusan :");
        jurusan = scan.nextLine();
        System.out.println("Golongan darah :");
        gol_darah = scan.nextLine();
        System.out.println("Tingkat :");
        tingkat = scan.nextInt();

        System.out.println("==Identitas Mahasiswa==");
        System.out.println("Nama lengkap   :" + nama_lengkap);
        System.out.println("Jurusan        :" + jurusan);
        System.out.println("Golongan darah :" + gol_darah);
        System.out.println("Tingkat        :" + tingkat);

    }

}
