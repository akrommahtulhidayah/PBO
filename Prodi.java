public class Prodi {

    private String kodeProdi; 
    private String namaProdi; 
    
    public Prodi(String kodeProdi, String namaProdi) {
        this.kodeProdi = kodeProdi;
        this.namaProdi = namaProdi;
    }

    public String getKodeProdi() { 
        return kodeProdi;
    }
    public String getNamaProdi() { 
        return namaProdi;
    }

    public static void main(String[] args) {
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
            
        System.out.println("Daftar Program Studi Politeknik Negeri Indramayu:"); 
        
        for (Prodi p : daftarProdi) {
            System.out.println("Kode Prodi: " + p.getKodeProdi() + ", Nama Prodi: " + p.getNamaProdi());
        }
    }
}
