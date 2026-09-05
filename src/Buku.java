public class Buku {
    private String idBuku;
    private String judulBuku;
    private String author;  //sebenernya author gk penting penting amat, kecuali ada buku yang sama judulnya tapi authornya beda, misal "Java for Dummies" sama "Java for Dummies" tapi authornya beda, jadi bisa dibedain
    private String status;

    public Buku(String idBuku, String judulBuku, String author) {
        this.judulBuku = judulBuku;
        this.idBuku = idBuku;
        this.author = author;
        this.status = "Tersedia";
    }
    public String getIdBuku() { return idBuku; }
    public void setIdBuku(String idBuku) { this.idBuku = idBuku; }
    
    public String getJudulBuku() { return judulBuku; }
    public void setJudulBuku(String judulBuku) { this.judulBuku = judulBuku; }
    
    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }
    //Inituh buat nge update status buku biar nanti klo kepinjem, yang asalanya tersedia jadi dipinjem
    public String getStatus() { return status; }
    public void setStatus(String status) {
        if (status.equals("Dipinjam") || status.equals("Tersedia")) {
            this.status = status;
        } else {
            throw new IllegalArgumentException("Status harus 'Dipinjam' atau 'Tersedia'");
        }
    }
    //Ini buat ngebandingin, misal ada buku yang sama tapi authornya beda
    //jujur baru tau soal ini
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Buku buku = (Buku) obj;
        return idBuku.equals(buku.idBuku);
    }
}
