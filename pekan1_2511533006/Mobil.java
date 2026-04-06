package pekan1_2511533006;

//Nama: Zaki Misucha Andefi - NIM: 2511533006

public class Mobil {
 // 1. Atribut
 private String nama;
 private int tahun;
 private int cc;
 private long harga;
 private String merk;

 // Constructor untuk memudahkan pembuatan objek
 public Mobil(String nama, int tahun, int cc, long harga, String merk) {
     this.nama = nama;
     this.tahun = tahun;
     this.cc = cc;
     this.harga = harga;
     this.merk = merk;
 }

 // 2. Selektor (Getter) - Mengambil nilai atribut
 public String getNama() { return nama; }
 public int getTahun() { return tahun; }
 public int getCc() { return cc; }
 public long getHarga() { return harga; }
 public String getMerk() { return merk; }

 // 3. Mutator (Setter) - Mengubah nilai atribut
 public void setNama(String nama) { this.nama = nama; }
 public void setTahun(int tahun) { this.tahun = tahun; }
 public void setCc(int cc) { this.cc = cc; }
 public void setHarga(long harga) { this.harga = harga; }
 public void setMerk(String merk) { this.merk = merk; }

 // Method tambahan untuk menampilkan data mobil
 public void tampilkanInfo() {
     System.out.println(merk + " " + nama + " (" + tahun + ") | " + cc + "cc | Rp" + harga);
 }
}