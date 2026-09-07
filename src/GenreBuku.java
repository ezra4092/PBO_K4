public class GenreBuku {
    private String idGenre;
    private String namaGenre;

    public GenreBuku(String idGenre, String namaGenre) {
        this.idGenre = idGenre;
        this.namaGenre = namaGenre;
    }

    public String getIdGenre() { return idGenre; }
    public void setIdGenre(String idGenre) { this.idGenre = idGenre; }

    public String getNamaGenre() { return namaGenre; }
    public void setNamaGenre(String namaGenre) { this.namaGenre = namaGenre; }
}