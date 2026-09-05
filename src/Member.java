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
    //Jujur gw baru tau standar ngetiknya get ke set
    public String getId() { return id; } // Biar Kapital cik
    public void setId(String id) { this.id = id; }
    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public void pinjamBuku(Buku buku) {
        //Ngecek bukunya ada apa enggakk yang mau dipinjem
        if (buku.getStatus().equals("Dipinjam")) {
            System.out.println("Gagal: Buku '" + buku.getJudulBuku() + "' sedang dipinjam.");
            return; // Stop
        }

        //Ngecek member minjem buku yang sama apa nggak, kalo nggak baru bisa minjem
        if (!bukuList.contains(buku)) {
            bukuList.add(buku);
            buku.setStatus("Dipinjam"); // 3. IMPORTANT: Update the book's status!
            System.out.println("Sukses: " + name + " berhasil meminjam '" + buku.getJudulBuku() + "'");
        } else {
            System.out.println("Gagal: " + name + " sudah meminjam buku ini.");
        }
    }
    public void kembalikanBuku(Buku buku) {
        //Ngecek klo bukunya udah ada dipinjem apa belum
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
            System.out.println("- [" + buku.getIdBuku() + "] " + buku.getJudulBuku() + " by " + buku.getAuthor());
        }
        System.out.println("----------------------------------------\n");
    }
}





