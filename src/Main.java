public class Main {
    public static void main(String[] args) {
        // 1. Bikin Genre-nya dulu
        GenreBuku genre1 = new GenreBuku("G01", "Programming");
        GenreBuku genre2 = new GenreBuku("G02", "Software Engineering");

        // 2. Bikin Buku dengan memasukkan objek genre ke dalamnya
        Buku buku1 = new Buku("B001", "Java for Dummies", "Barry Burd", genre1);
        Buku buku2 = new Buku("B002", "Clean Code", "Robert C. Martin", genre2);
        Buku buku3 = new Buku("B003", "Head First Java", "Kathy Sierra", genre1);

        Member member1 = new Member("M01", "Budi");
        Member member2 = new Member("M02", "Siti");

        System.out.println("== PROSES PEMINJAMAN ==");
        
        member1.pinjamBuku(buku1); 
        member1.pinjamBuku(buku2); 
        member2.pinjamBuku(buku3);
        
        // Cek daftar buku yang dipinjam (Sekarang akan muncul Genrenya)
        member1.displayBuku();
        member2.displayBuku();

        System.out.println("== TEST CASE GAGAL ==");
        member1.pinjamBuku(buku1); // Budi minjem yang sama lagi
        member2.pinjamBuku(buku1); // Siti minjem yang lagi dipinjem

        System.out.println("\n== CEK STATUS BUKU ==");
        System.out.println("Status Buku B001: " + buku1.getStatus()); 
        System.out.println("Status Buku B002: " + buku2.getStatus()); 
        System.out.println("Status Buku B003: " + buku3.getStatus()); 
    }
}
