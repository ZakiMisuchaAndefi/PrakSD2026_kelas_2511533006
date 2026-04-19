package pekan3_2511533006;
public class Website_2511533006 {
    // Atribut menggunakan akhiran 4 digit terakhir
    private String judul_3006;
    private String url_3006;

    // Constructor untuk menginisialisasi atribut
    public Website_2511533006(String judul_3006, String url_3006) {
        this.judul_3006 = judul_3006;
        this.url_3006 = url_3006;
    }

    // Selektor (Getter)
    public String getJudul_3006() {
        return judul_3006;
    }

    public String getUrl_3006() {
        return url_3006;
    }

    // Mutator (Setter)
    public void setJudul_3006(String judul_3006) {
        this.judul_3006 = judul_3006;
    }

    public void setUrl_3006(String url_3006) {
        this.url_3006 = url_3006;
    }
}