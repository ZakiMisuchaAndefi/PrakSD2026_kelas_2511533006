package pekan6_2511533006;
import java.util.Scanner;

public class Main_Playlist_2511533006 {
    public static void main(String[] args) {
        // Variabel scanner dan playlist menggunakan akhiran NIM
        Scanner scanner_3006 = new Scanner(System.in);
        Musik_2511533006 playlist_3006 = new Musik_2511533006();
        int pilihan_3006;

        do {
            // Tampilan menu dengan NIM lengkap sesuai contoh [cite: 32]
            System.out.println("Playlist Musik NIM: 2511533006");
            System.out.println("1. Tambah Lagu");
            System.out.println("2. Hapus Lagu Pertama");
            System.out.println("3. Lihat Playlist (Maju)");
            System.out.println("4. Lihat Playlist (Mundur)");
            System.out.println("5. Cari Lagu");
            System.out.println("6. Keluar");
            System.out.print("Pilihan: ");
            
            pilihan_3006 = scanner_3006.nextInt();
            scanner_3006.nextLine(); // Membersihkan buffer

            switch (pilihan_3006) {
                case 1:
                    System.out.print("Judul: ");
                    String judul = scanner_3006.nextLine();
                    System.out.print("Penyanyi: ");
                    String penyanyi = scanner_3006.nextLine();
                    playlist_3006.tambahLagu_3006(judul, penyanyi);
                    break;
                case 2:
                    playlist_3006.hapusLaguAwal_3006();
                    break;
                case 3:
                    playlist_3006.tampilMaju_3006();
                    break;
                case 4:
                    playlist_3006.tampilMundur_3006();
                    break;
                case 5:
                    System.out.print("Masukkan judul lagu yang dicari: ");
                    String judulCari = scanner_3006.nextLine();
                    playlist_3006.cariLagu_3006(judulCari);
                    break;
                case 6:
                    System.out.println("Keluar dari program playlist.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!\n");
            }
        } while (pilihan_3006 != 6);

        scanner_3006.close();
    }
}