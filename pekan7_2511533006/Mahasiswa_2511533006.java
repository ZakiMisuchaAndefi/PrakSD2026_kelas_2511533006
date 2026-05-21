package pekan7_2511533006;

public class Mahasiswa_2511533006 {
    private String nama;
    private String nim;
    private String programStudi;

    public Mahasiswa_2511533006(String nama, String nim, String programStudi) {
        this.nama = nama;
        this.nim = nim;
        this.programStudi = programStudi;
    }

    public String getNama_2511533006() { return nama; }
    public void setNama_2511533006(String nama) { this.nama = nama; }

    public String getNim_2511533006() { return nim; }
    public void setNim_2511533006(String nim) { this.nim = nim; }

    public String getProgramStudi_2511533006() { return programStudi; }
    public void setProgramStudi_2511533006(String programStudi) { this.programStudi = programStudi; }

    @Override
    public String toString() {
        return nama + " (" + nim + ") - " + programStudi;
    }
}