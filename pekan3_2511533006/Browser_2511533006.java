package pekan3_2511533006;
import java.util.*;

public class Browser_2511533006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Menggunakan java.util.Stack dengan objek kelas ADT
        Stack<Website_2511533006> historyStack = new Stack<>();
        int pilihan;

        do {
            System.out.println("\n=== Browser History NIM: 2511533006 ===");
            System.out.println("1. Kunjungi Website (Push)");
            System.out.println("2. Tombol Back (Pop)");
            System.out.println("3. Lihat Halaman Aktif (Peek)");
            System.out.println("4. Cek Status History");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");
            
            // Penanganan jika input bukan angka bisa ditambahkan, 
            // namun ini foku pada logika Stack
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Konsumsi karakter newline

            switch (pilihan) {
                case 1:
                    // Push: Memasukkan data website ke tumpukan teratas
                    System.out.print("Masukkan Judul: ");
                    String judul = scanner.nextLine();
                    System.out.print("Masukkan URL: ");
                    String url = scanner.nextLine();

                    Website_2511533006 webBaru = new Website_2511533006(judul, url);
                    historyStack.push(webBaru);
                    System.out.println("Berhasil mengunjungi halaman!");
                    break;

                case 2:
                    // Pop: Menghapus halaman terakhir dengan handling Exception
                    try {
                        Website_2511533006 webDihapus = historyStack.pop();
                        System.out.println("Berhasil kembali dari halaman: " + webDihapus.getJudul_3006());
                    } catch (EmptyStackException e) {
                        System.out.println("Peringatan: Riwayat browser kosong! Tidak ada halaman untuk kembali.");
                    }
                    break;

                case 3:
                    // Peek: Melihat detail website saat ini tanpa menghapusnya
                    try {
                        Website_2511533006 webAktif = historyStack.peek();
                        System.out.println("Halaman saat ini: " + webAktif.getJudul_3006());
                        System.out.println("URL: " + webAktif.getUrl_3006());
                    } catch (EmptyStackException e) {
                        System.out.println("Peringatan: Tidak ada halaman yang sedang aktif dibuka.");
                    }
                    break;

                case 4:
                    // Mengecek apakah stack kosong atau menampilkan ukurannya
                    if (historyStack.isEmpty()) {
                        System.out.println("Status: Riwayat penelusuran saat ini kosong.");
                    } else {
                        System.out.println("Status: Terdapat " + historyStack.size() + " halaman tersimpan dalam riwayat.");
                    }
                    break;

                case 5:
                    System.out.println("Menutup browser. Sampai jumpa!");
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia. Silakan masukkan angka 1-5.");
            }
        } while (pilihan != 5);

        scanner.close();
    }
}