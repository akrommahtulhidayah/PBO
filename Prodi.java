public class Prodi {

<<<<<<< HEAD
    private String kodeProdi; // menyimpan kode program studi
    private String namaProdi; // menyimpan nama program studi
    
    // konstruktor digunakan untuk menginisialisasi objek prodi
=======
    private String kodeProdi; 
    private String namaProdi; 
    
>>>>>>> 44eb163b6b326ee8c86fdb82fd1d2d06992d56cb
    public Prodi(String kodeProdi, String namaProdi) {
        this.kodeProdi = kodeProdi;
        this.namaProdi = namaProdi;
    }

<<<<<<< HEAD
    // method getter digunakan untuk mengakses dan mengambil atribut dari sebuah objek 
    public String getKodeProdi() { // untuk mendapatkan kode prodi
        return kodeProdi;
    }
    public String getNamaProdi() { // untuk mendapatkan kode prodi
=======
    public String getKodeProdi() { 
        return kodeProdi;
    }
    public String getNamaProdi() { 
>>>>>>> 44eb163b6b326ee8c86fdb82fd1d2d06992d56cb
        return namaProdi;
    }

    public static void main(String[] args) {
<<<<<<< HEAD
        // menggunakan array untuk menyimpan objek daftar prodi
=======
>>>>>>> 44eb163b6b326ee8c86fdb82fd1d2d06992d56cb
        Prodi[] daftarProdi = {
            new Prodi("55401", "Teknik Informatika"),
            new Prodi("55301", "Rekayasa Perangkat Lunak"),
            new Prodi("55302", "Sistem Informasi Kota Cerdas"),
            new Prodi("90351", "Teknologi Rekayasa Komputer"), 
            new Prodi("14401", "Keperawatan"),
            new Prodi("13352", "Teknologi Laboratorium Medis"),
            new Prodi("20307", "Teknololgi Rekayasa Elektro-medis"),
            new Prodi("21401", "Teknik Mesin"),
            new Prodi("21307", "Perancangan Manufaktur"),
            new Prodi("21405", "Teknik Pendingin dan Tata Udara"),
            new Prodi("30404", "Teknologi Rekayasa Instrumentasi dan Kontrol")
        };
            
<<<<<<< HEAD
        System.out.println("Daftar Program Studi Politeknik Negeri Indramayu:"); // Menampilkan judul daftar program studi
        
        // menggunakan perulangan untuk menampilkan kode prodi dan nama prodi dari array daftar prodi
=======
        System.out.println("Daftar Program Studi Politeknik Negeri Indramayu:"); 
        
>>>>>>> 44eb163b6b326ee8c86fdb82fd1d2d06992d56cb
        for (Prodi p : daftarProdi) {
            System.out.println("Kode Prodi: " + p.getKodeProdi() + ", Nama Prodi: " + p.getNamaProdi());
        }
    }
}
