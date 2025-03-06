package OOP1;

import OOP1.util.Truk;

public class KendaraanApp {
    public static void main(String[] args) {
        Truk truk = new Truk();
        truk.setMuatanMax(20);
        truk.setJmlRoda(6);
        truk.setBahanBakar("Solar");
        truk.setWarna("Biru cacat");

        System.out.println("Truk warna: " + truk.getWarna());
        System.out.println("Jumlah Roda: " + truk.getJmlRoda());
        System.out.println("Bahan Bakar: " + truk.getBahanBakar());


    }
}
