package pekan6_2511533006;

public class Lagu_2511533006 {
    private String judul_3006;       
    private String penyanyi_3006;    
    public Lagu_2511533006 next_3006;       
    public Lagu_2511533006 prev_3006;       

    // Method Constructor
    public Lagu_2511533006(String judul, String penyanyi) {
        this.judul_3006 = judul;
        this.penyanyi_3006 = penyanyi;
        this.next_3006 = null;
        this.prev_3006 = null;
    }

    // Method Getter
    public String getJudul_3006() {
        return judul_3006;
    }

    public String getPenyanyi_3006() {
        return penyanyi_3006;
    }

    // Method Setter
    public void setJudul_3006(String judul) {
        this.judul_3006 = judul;
    }

    public void setPenyanyi_3006(String penyanyi) {
        this.penyanyi_3006 = penyanyi;
    }
}