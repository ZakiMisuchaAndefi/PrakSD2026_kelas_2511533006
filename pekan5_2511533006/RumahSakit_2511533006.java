package pekan5_2511533006;

//============================================================
//Kelas Driver Rumah Sakit - Simulasi Antrian (Single Linked List)
//Tugas Praktikum Pekan 5: Struktur Data
//NIM: 2511533006
//============================================================

import java.util.Scanner;

public class RumahSakit_2511533006 {

 // ── Field utama linked list ───────────────────────────────
 private static Pasien_2511533006 head_3006  = null; // kepala antrian
 private static int counterAntrian_3006       = 0;   // auto-increment nomor antrian

 // ============================================================
 // 1. DAFTARKAN PASIEN — Insert at Tail
 // Menambahkan node baru di akhir linked list (FIFO).
 // ============================================================
 private static void daftarkanPasien_3006(Scanner sc) {
     System.out.print("Masukkan Nama Pasien : ");
     String nama_3006 = sc.nextLine();

     System.out.print("Masukkan Keluhan     : ");
     String keluhan_3006 = sc.nextLine();

     // Auto-increment nomor antrian
     counterAntrian_3006++;

     // Buat node baru
     Pasien_2511533006 nodeBaru_3006 = new Pasien_2511533006(
             nama_3006, keluhan_3006, counterAntrian_3006);

     // Jika list kosong → node langsung jadi head
     if (head_3006 == null) {
         head_3006 = nodeBaru_3006;
     } else {
         // Telusuri sampai node terakhir (next == null)
         Pasien_2511533006 temp_3006 = head_3006;
         while (temp_3006.next_3006 != null) {
             temp_3006 = temp_3006.next_3006;
         }
         // Sambungkan node baru di ekor
         temp_3006.next_3006 = nodeBaru_3006;
     }

     System.out.println("  Pasien berhasil didaftarkan! Nomor Antrian: "
             + counterAntrian_3006);
 }

 // ============================================================
 // 2. PANGGIL PASIEN — Delete Head
 // Menghapus node terdepan dan menampilkan datanya.
 // ============================================================
 private static void panggilPasien_3006() {
     // Cek kondisi list kosong
     if (head_3006 == null) {
         System.out.println("  Antrian kosong. Tidak ada pasien untuk dipanggil.");
         return;
     }

     // Simpan data pasien yang dipanggil sebelum dihapus
     Pasien_2511533006 dipanggil_3006 = head_3006;

     // Geser head ke node berikutnya
     head_3006 = head_3006.next_3006;

     // Putuskan pointer agar node lama bisa di-GC
     dipanggil_3006.next_3006 = null;

     System.out.println("╔══════════════════════════════════════╗");
     System.out.println("    PASIEN DIPANGGIL");
     System.out.println("  No. Antrian : " + dipanggil_3006.getNomorAntrian_3006());
     System.out.println("  Nama        : " + dipanggil_3006.getNamaPasien_3006());
     System.out.println("  Keluhan     : " + dipanggil_3006.getPenyakit_3006());
     System.out.println("╚══════════════════════════════════════╝");
 }

 // ============================================================
 // 3. TAMPILKAN ANTRIAN — Display / Traverse
 // Menelusuri linked list dari head hingga null.
 // ============================================================
 private static void tampilkanAntrian_3006() {
     // Cek kondisi list kosong
     if (head_3006 == null) {
         System.out.println("⚠ Antrian kosong. Tidak ada pasien dalam antrian.");
         return;
     }

     System.out.println("╔══════════════════════════════════════════════════╗");
     System.out.println("           DAFTAR ANTRIAN PASIEN");
     System.out.println("╠══════════════════════════════════════════════════╣");
     System.out.printf("  %-5s %-20s %-20s%n", "No.", "Nama Pasien", "Keluhan");
     System.out.println("  ─────────────────────────────────────────────────");

     // Telusuri list dari head sampai null
     Pasien_2511533006 current_3006 = head_3006;
     int posisi_3006 = 1;

     while (current_3006 != null) {
         System.out.printf("  %-5d %-20s %-20s%n",
                 posisi_3006,
                 current_3006.getNamaPasien_3006(),
                 current_3006.getPenyakit_3006());
         current_3006 = current_3006.next_3006; // pindah ke node berikutnya
         posisi_3006++;
     }

     System.out.println("╚══════════════════════════════════════════════════╝");
 }

 // ============================================================
 // 4. CARI PASIEN — Search (Case-Insensitive)
 // Pencarian berdasarkan nama pasien.
 // ============================================================
 private static void cariPasien_3006(Scanner sc) {
     System.out.print("Masukkan Nama Pasien yang dicari : ");
     String keyword_3006 = sc.nextLine().trim();

     boolean ditemukan_3006 = false;

     // Telusuri list dari head sampai null
     Pasien_2511533006 current_3006 = head_3006;
     int posisi_3006 = 1;

     while (current_3006 != null) {
         // Bandingkan nama secara case-insensitive
         if (current_3006.getNamaPasien_3006()
                 .equalsIgnoreCase(keyword_3006)) {

             if (!ditemukan_3006) {
                 System.out.println("╔══════════════════════════════════════════════════╗");
                 System.out.println("    HASIL PENCARIAN: \"" + keyword_3006 + "\"");
                 System.out.println("╠══════════════════════════════════════════════════╣");
             }

             System.out.println("  Posisi dalam antrian : " + posisi_3006);
             System.out.println("  No. Antrian          : " + current_3006.getNomorAntrian_3006());
             System.out.println("  Nama Pasien          : " + current_3006.getNamaPasien_3006());
             System.out.println("  Keluhan              : " + current_3006.getPenyakit_3006());
             System.out.println("  ─────────────────────────────────────────────────");

             ditemukan_3006 = true;
         }

         current_3006 = current_3006.next_3006; // pindah ke node berikutnya
         posisi_3006++;
     }

     if (!ditemukan_3006) {
         System.out.println(" Pasien dengan nama \"" + keyword_3006 + "\" tidak ditemukan.");
     } else {
         System.out.println("╚══════════════════════════════════════════════════╝");
     }
 }

 // ============================================================
 // 5. CEK STATUS ANTRIAN
 // Menampilkan jumlah total pasien & informasi pasien terdepan.
 // ============================================================
 private static void cekStatusAntrian_3006() {
     // Cek kondisi list kosong
     if (head_3006 == null) {
         System.out.println(" Antrian kosong. Tidak ada pasien saat ini.");
         return;
     }

     // Hitung jumlah node
     int total_3006 = 0;
     Pasien_2511533006 current_3006 = head_3006;
     while (current_3006 != null) {
         total_3006++;
         current_3006 = current_3006.next_3006;
     }

     System.out.println("╔══════════════════════════════════════╗");
     System.out.println("STATUS ANTRIAN");
     System.out.println("  Total Pasien    : " + total_3006);
     System.out.println("  ─────────────────────────────────────");
     System.out.println("  Pasien Terdepan :");
     System.out.println("  No. Antrian  : " + head_3006.getNomorAntrian_3006());
     System.out.println("  Nama         : " + head_3006.getNamaPasien_3006());
     System.out.println("  Keluhan      : " + head_3006.getPenyakit_3006());
     System.out.println("╚══════════════════════════════════════╝");
 }

 // ============================================================
 // MAIN — Menu utama program
 // ============================================================
 public static void main(String[] args) {
     Scanner scanner_3006 = new Scanner(System.in);
     int pilihan_3006;

     System.out.println("╔══════════════════════════════════════════════════╗");
     System.out.println(" 	Antrian Rumah Sakit — NIM: 2511533006");
     System.out.println("╚══════════════════════════════════════════════════╝");

     do {
         // Tampilkan menu
         System.out.println("\n┌──────────────────────────────────┐");
         System.out.println("│              MENU                │");
         System.out.println("├──────────────────────────────────┤");
         System.out.println("│ 1. Daftarkan Pasien  (Insert)    │");
         System.out.println("│ 2. Panggil Pasien    (Delete)    │");
         System.out.println("│ 3. Tampilkan Antrian (Display)   │");
         System.out.println("│ 4. Cari Pasien       (Search)    │");
         System.out.println("│ 5. Cek Status Antrian            │");
         System.out.println("│ 6. Keluar                        │");
         System.out.println("└──────────────────────────────────┘");
         System.out.print("Pilihan: ");

         // Validasi input menu
         while (!scanner_3006.hasNextInt()) {
             System.out.print("Input tidak valid. Masukkan angka 1-6: ");
             scanner_3006.next();
         }
         pilihan_3006 = scanner_3006.nextInt();
         scanner_3006.nextLine(); // buang newline sisa

         System.out.println();

         // Routing menu
         switch (pilihan_3006) {
             case 1: daftarkanPasien_3006(scanner_3006); break;
             case 2: panggilPasien_3006();               break;
             case 3: tampilkanAntrian_3006();            break;
             case 4: cariPasien_3006(scanner_3006);      break;
             case 5: cekStatusAntrian_3006();            break;
             case 6:
                 System.out.println(" Terima kasih. Program selesai.");
                 break;
             default:
                 System.out.println(" Pilihan tidak valid. Masukkan angka 1-6.");
         }

     } while (pilihan_3006 != 6);

     scanner_3006.close();
 }
}