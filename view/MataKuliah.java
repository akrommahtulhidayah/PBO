package view;
import Model.Matkul;

public class MataKuliah {
    public static void main(String[] args) {
        Matkul matkul1 = new Matkul("IF101", "Pemrograman Dasar", 3, "Dr. Andi");
        Matkul matkul2 = new Matkul("IF102", "Struktur Data", 4, "Dr. Budi");

        matkul1.lihatMatkul();
        matkul2.lihatMatkul();
    }   
}