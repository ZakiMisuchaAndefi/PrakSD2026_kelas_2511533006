package pekan5_2511533006;

//============================================================
//Kelas ADT Pasien - Single Linked List Node
//Tugas Praktikum Pekan 5: Struktur Data
//NIM: 2511533006
//============================================================

public class Pasien_2511533006 {

 // ── Atribut ──────────────────────────────────────────────
 private String namaPasien_3006;
 private String penyakit_3006;
 private int nomorAntrian_3006;

 // Pointer ke node Pasien berikutnya
 public Pasien_2511533006 next_3006;

 // ── Constructor ──────────────────────────────────────────
 /**
  * Menginisialisasi semua atribut node Pasien.
  *
  * @param nama    Nama pasien
  * @param keluhan Keluhan / penyakit pasien
  * @param nomor   Nomor antrian pasien
  */
 public Pasien_2511533006(String nama, String keluhan, int nomor) {
     this.namaPasien_3006   = nama;
     this.penyakit_3006     = keluhan;
     this.nomorAntrian_3006 = nomor;
     this.next_3006         = null; // pointer awal selalu null
 }

 // ── Getter (Selektor) ────────────────────────────────────
 public String getNamaPasien_3006() {
     return namaPasien_3006;
 }

 public String getPenyakit_3006() {
     return penyakit_3006;
 }

 public int getNomorAntrian_3006() {
     return nomorAntrian_3006;
 }

 public Pasien_2511533006 getNext_3006() {
     return next_3006;
 }

 // ── Setter (Mutator) ─────────────────────────────────────
 public void setNamaPasien_3006(String nama) {
     this.namaPasien_3006 = nama;
 }

 public void setPenyakit_3006(String keluhan) {
     this.penyakit_3006 = keluhan;
 }

 public void setNomorAntrian_3006(int nomor) {
     this.nomorAntrian_3006 = nomor;
 }

 public void setNext_3006(Pasien_2511533006 next) {
     this.next_3006 = next;
 }
}