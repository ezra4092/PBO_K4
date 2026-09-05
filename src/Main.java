public class Main {
    public static void main(String[] args) {
        Buku buku1 = new Buku("B001", "Java for Dummies", "Barry Burd");
        Buku buku2 = new Buku("B002", "Clean Code", "Robert C. Martin");
        Buku buku3 = new Buku("B003", "Head First Java", "Kathy Sierra");

        Member member1 = new Member("M01", "Budi");
        Member member2 = new Member("M02", "Siti");

        System.out.println("== PROSES PEMINJAMAN ==");
        //Command buat minjem
        member1.pinjamBuku(buku1); 
        member1.pinjamBuku(buku2); 
        member2.pinjamBuku(buku3);
        
        //Ngecek Buku yang udah dipinjem sama member
        member1.displayBuku();
        member2.displayBuku();

        //Ngecek klo case nya gagal
        member1.pinjamBuku(buku1); // Budi minjem yang sama lagi
        member2.pinjamBuku(buku1); // Siti minjem yang lagi dipinjem

        // Ngecek status peminjaman
        System.out.println("Status Buku B001: " + buku1.getStatus()); 
        System.out.println("Status Buku B002: " + buku2.getStatus()); 
        System.out.println("Status Buku B003: " + buku3.getStatus()); 
        
    }
}