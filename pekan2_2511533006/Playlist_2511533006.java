package pekan2_2511533006;
import java.util.*;

public class Playlist_2511533006 {
    public static void main(String[] args) {
        // Deklarasi ArrayList menggunakan tipe objek Musik_2511533006
        ArrayList<Musik_2511533006> playlist = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int pilihan = 0;

        while (pilihan != 4) {
            System.out.println("=== Playlist Musik NIM: 2511533006 ===");
            System.out.println("1. Tambah Lagu");
            System.out.println("2. Lihat Playlist");
            System.out.println("3. Hapus Lagu");
            System.out.println("4. Keluar");
            System.out.print("Pilihan: ");

            // Validasi input menu
            if(scanner.hasNextInt()) {
                pilihan = scanner.nextInt();
                scanner.nextLine(); // Membuang karakter newline
            } else {
                System.out.println("Input tidak valid. Harap masukkan angka.\n");
                scanner.nextLine();
                continue;
            }

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Judul: ");
                    String judul = scanner.nextLine();
                    System.out.print("Masukkan Penyanyi: ");
                    String penyanyi = scanner.nextLine();
                    System.out.print("Masukkan Durasi (detik): ");
                    
                    int durasi = 0;
                    if(scanner.hasNextInt()){
                        durasi = scanner.nextInt();
                        scanner.nextLine();
                        // Menambahkan lagu baru ke ArrayList
                        playlist.add(new Musik_2511533006(judul, penyanyi, durasi));
                        System.out.println("Data berhasil ditambahkan!\n");
                    } else {
                        System.out.println("Format salah. Durasi harus berupa angka!\n");
                        scanner.nextLine();
                    }
                    break;

                case 2:
                    System.out.println("\n--- Daftar Lagu ---");
                    if (playlist.isEmpty()) {
                        System.out.println("Playlist masih kosong.\n");
                    } else {
                        // Menggunakan perulangan untuk mencetak isi playlist
                        for (int i = 0; i < playlist.size(); i++) {
                            Musik_2511533006 lagu = playlist.get(i);
                            System.out.println((i + 1) + ". " + lagu.getJudul_3006() + " - " +
                                    lagu.getPenyanyi_3006() + " (" + lagu.getDurasi_3006() + " detik)");
                        }
                        // Cek Kapasitas
                        System.out.println("Total lagu di playlist: " + playlist.size() + "\n");
                    }
                    break;

                case 3:
                    System.out.println("\n--- Hapus Lagu ---");
                    if (playlist.isEmpty()) {
                        System.out.println("Playlist kosong, tidak ada lagu yang bisa dihapus.\n");
                    } else {
                        System.out.print("Masukkan nomor indeks lagu yang ingin dihapus (1 - " + playlist.size() + "): ");
                        if(scanner.hasNextInt()){
                            int index = scanner.nextInt();
                            scanner.nextLine();
                            // Menghapus lagu berdasarkan indeks ArrayList
                            if (index > 0 && index <= playlist.size()) {
                                playlist.remove(index - 1);
                                System.out.println("Lagu berhasil dihapus!\n");
                            } else {
                                System.out.println("Nomor indeks tidak ditemukan!\n");
                            }
                        } else {
                            System.out.println("Input tidak valid.\n");
                            scanner.nextLine();
                        }
                    }
                    break;

                case 4:
                    System.out.println("Keluar dari program.");
                    break;

                default:
                    System.out.println("Pilihan tidak ada di menu. Silakan coba lagi.\n");
            }
        }
        scanner.close();
    }
}