package Model;

public class Matkul {
    public String kodeMatkul;
    public String namaMatkul;
    public int sks;
    public String dosenPengampu;

    public Matkul(String kodeMatkul, String namaMatkul, int sks, String dosenPengampu) {
        this.kodeMatkul = kodeMatkul;
        this.namaMatkul = namaMatkul;
        this.sks = sks;
        this.dosenPengampu = dosenPengampu;
    }

    public void lihatMatkul() {
        System.out.println("Kode Matkul: " + kodeMatkul + ", Nama Matkul: " + namaMatkul + ", SKS: " + sks + ", Dosen Pengampu: " + dosenPengampu);
    }
}
