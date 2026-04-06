package pekan1_2511533006;

//Nama: Zaki Misucha Andefi - NIM: 2511533006

public class DriverMobil {
 
 // Inisialisasi Array biasa dengan kapasitas maksimal
 private static Mobil[] dataMobil = new Mobil[100];
 // Variabel untuk melacak jumlah mobil yang ada di dalam array
 private static int jumlahMobil = 0;

 public static void main(String[] args) {
     System.out.println("=== PROGRAM ADT MOBIL ===");
     System.out.println("NIM: 3006\n");

     // Menambahkan beberapa mobil
     tambahMobil(new Mobil("Avanza", 2020, 1300, 150000000, "Toyota"));
     tambahMobil(new Mobil("Voxy", 2025, 2000, 600000000, "Toyota"));
     tambahMobil(new Mobil("Alphard Hybrid", 2025, 2500, 1400000000, "Toyota"));

     tampilSemuaMobil();

     // Menguji penghapusan mobil
     System.out.println("\nMenghapus mobil Voxy dari array...");
     hapusMobil("Voxy");

     tampilSemuaMobil();
 }

 // --- Method Tambah Mobil ---
 public static void tambahMobil(Mobil mobilBaru) {
     if (jumlahMobil < dataMobil.length) {
         dataMobil[jumlahMobil] = mobilBaru; // Masukkan ke index yang kosong
         jumlahMobil++;                      // Tambah counter
         System.out.println("[+] Berhasil menambahkan: " + mobilBaru.getNama());
     } else {
         System.out.println("[-] Gagal: Kapasitas array sudah penuh!");
     }
 }

 // --- Method Hapus Mobil (Berdasarkan Nama) ---
 public static void hapusMobil(String namaTarget) {
     int indexDihapus = -1;

     // 1. Cari index array dari mobil yang ingin dihapus
     for (int i = 0; i < jumlahMobil; i++) {
         if (dataMobil[i].getNama().equalsIgnoreCase(namaTarget)) {
             indexDihapus = i;
             break;
         }
     }

     if (indexDihapus != -1) {
         for (int i = indexDihapus; i < jumlahMobil - 1; i++) {
             dataMobil[i] = dataMobil[i + 1];
         }
         dataMobil[jumlahMobil - 1] = null; 
         jumlahMobil--;
         
         System.out.println("[+] Mobil " + namaTarget + " berhasil dihapus.");
     } else {
         System.out.println("[-] Mobil " + namaTarget + " tidak ditemukan.");
     }
 }

 // --- Method Bantuan untuk Menampilkan Array ---
 public static void tampilSemuaMobil() {
     System.out.println("\nDaftar Mobil Saat Ini:");
     if (jumlahMobil == 0) {
         System.out.println("Data masih kosong.");
     } else {
         for (int i = 0; i < jumlahMobil; i++) {
             System.out.print((i + 1) + ". ");
             dataMobil[i].tampilkanInfo();
         }
     }
 }
}