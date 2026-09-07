import java.util.List;
import java.util.ArrayList;

public class Member {
    private String id;
    private String name;
    private List<Buku> bukuList;

    public Member(String id, String name) {
        this.id = id;
        this.name = name;
        this.bukuList = new ArrayList<>();
    }
    
    public String getId() { return id; } 
    public void setId(String id) { this.id = id; }
    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public void pinjamBuku(Buku buku) {
        if (buku.getStatus().equals("Dipinjam")) {
            System.out.println("Gagal: Buku '" + buku.getJudulBuku() + "' sedang dipinjam.");
            return; 
        }

        if (!bukuList.contains(buku)) {
            bukuList.add(buku);
            buku.setStatus("Dipinjam"); 
            System.out.println("Sukses: " + name + " berhasil meminjam '" + buku.getJudulBuku() + "'");
        } else {
            System.out.println("Gagal: " + name + " sudah meminjam buku ini.");
        }
    }
    
    public void kembalikanBuku(Buku buku) {
        if (bukuList.contains(buku)) {
            bukuList.remove(buku);
            buku.setStatus("Tersedia");
            System.out.println("Sukses: " + name + " telah mengembalikan '" + buku.getJudulBuku() + "'");
        } else {
            System.out.println("Gagal: " + name + " tidak sedang meminjam buku ini.");
        }
    }

    public void displayBuku() {
        System.out.println("\n--- Daftar Buku dipinjam oleh " + name + " ---");
        if (bukuList.isEmpty()) {
            System.out.println("Belum ada buku yang dipinjam.");
            return;
        }
        for (Buku buku : bukuList) {
            // Update disini: Manggil nama genre dari objek buku -> genre -> namaGenre
            System.out.println("- [" + buku.getIdBuku() + "] " + buku.getJudulBuku() + 
                               " by " + buku.getAuthor() + 
                               " (Genre: " + buku.getGenre().getNamaGenre() + ")");
        }
        System.out.println("----------------------------------------\n");
    }
}
