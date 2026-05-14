package pekan6_2511533006;

public class Musik_2511533006 {
    private Lagu_2511533006 head_3006;
    private Lagu_2511533006 tail_3006;

    public Musik_2511533006() {
        this.head_3006 = null;
        this.tail_3006 = null;
    }

    // 1. Menambah lagu baru di AKHIR playlist
    public void tambahLagu_3006(String judul, String penyanyi) {
        Lagu_2511533006 laguBaru = new Lagu_2511533006(judul, penyanyi);
        
        if (head_3006 == null) {
            head_3006 = laguBaru;
            tail_3006 = laguBaru;
        } else {
            tail_3006.next_3006 = laguBaru;
            laguBaru.prev_3006 = tail_3006;
            tail_3006 = laguBaru;
        }
        System.out.println("Lagu berhasil ditambahkan!\n");
    }

    // 2. Menghapus lagu pertama (head)
    public void hapusLaguAwal_3006() {
        if (head_3006 == null) {
            System.out.println("Playlist kosong, tidak ada yang bisa dihapus.\n");
            return;
        }
        
        if (head_3006 == tail_3006) {
            head_3006 = null;
            tail_3006 = null;
        } else {
            head_3006 = head_3006.next_3006;
            head_3006.prev_3006 = null;
        }
        System.out.println("Lagu pertama berhasil dihapus!\n");
    }

    // 3. Menampilkan semua lagu dari awal ke akhir
    public void tampilMaju_3006() {
        if (head_3006 == null) {
            System.out.println("Playlist masih kosong.\n");
            return;
        }
        
        System.out.println("--- Playlist (Maju) ---");
        Lagu_2511533006 current = head_3006;
        int no = 1;
        while (current != null) {
            System.out.println(no + ". " + current.getJudul_3006() + " - " + current.getPenyanyi_3006());
            current = current.next_3006;
            no++;
        }
        System.out.println();
    }

    // 4. Menampilkan semua lagu dari akhir ke awal
    public void tampilMundur_3006() {
        if (tail_3006 == null) {
            System.out.println("Playlist masih kosong.\n");
            return;
        }
        
        System.out.println("--- Playlist (Mundur) ---");
        Lagu_2511533006 current = tail_3006;
        int no = 1;
        while (current != null) {
            System.out.println(no + ". " + current.getJudul_3006() + " - " + current.getPenyanyi_3006());
            current = current.prev_3006;
            no++;
        }
        System.out.println();
    }

    // 5. Mencari lagu berdasarkan judul
    public void cariLagu_3006(String judulCari) {
        if (head_3006 == null) {
            System.out.println("Playlist masih kosong.\n");
            return;
        }

        Lagu_2511533006 current = head_3006;
        boolean ditemukan = false;
        
        System.out.println("--- Hasil Pencarian ---");
        while (current != null) {
            if (current.getJudul_3006().toLowerCase().contains(judulCari.toLowerCase())) {
                System.out.println("Ditemukan: " + current.getJudul_3006() + " - " + current.getPenyanyi_3006());
                ditemukan = true;
            }
            current = current.next_3006;
        }
        
        if (!ditemukan) {
            System.out.println("Lagu tidak ditemukan.");
        }
        System.out.println();
    }
}