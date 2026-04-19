package pekan2_2511533006;

public class Musik_2511533006 {
    // Atribut menggunakan akhiran 4 digit terakhir NIM
    private String judul_3006;
    private String penyanyi_3006;
    private int durasi_3006;

    // Constructor untuk inisialisasi
    public Musik_2511533006(String judul_3006, String penyanyi_3006, int durasi_3006) {
        this.judul_3006 = judul_3006;
        this.penyanyi_3006 = penyanyi_3006;
        this.durasi_3006 = durasi_3006;
    }

    // Selektor (Getter)
    public String getJudul_3006() {
        return judul_3006;
    }

    public String getPenyanyi_3006() {
        return penyanyi_3006;
    }

    public int getDurasi_3006() {
        return durasi_3006;
    }

    // Mutator (Setter)
    public void setJudul_3006(String judul_3006) {
        this.judul_3006 = judul_3006;
    }

    public void setPenyanyi_3006(String penyanyi_3006) {
        this.penyanyi_3006 = penyanyi_3006;
    }

    public void setDurasi_3006(int durasi_3006) {
        this.durasi_3006 = durasi_3006;
    }
}