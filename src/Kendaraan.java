import java.time.LocalDate;

public class Kendaraan {
    // Properties
    protected String merk;
    protected String warna;
    protected int tahunProduksi;
    private String nomorRangka;

    // Constructor
    public Kendaraan(String merk, String warna, int tahunProduksi) {
        this.merk = merk;
        this.warna = warna;
        this.tahunProduksi = tahunProduksi;
        this.nomorRangka = generateNomorRangka();
        System.out.println("Constructor Kendaraan dipanggil");
    }

    private String generateNomorRangka() {
        return merk.substring(0, 3).toUpperCase() + tahunProduksi + "001";
    }

    // Method untuk menampilkan info
    public void displayInfo() {
        System.out.println("=== Info Kendaraan ===");
        System.out.println("Merk: " + merk);
        System.out.println("Warna: " + warna);
        System.out.println("Tahun Produksi: " + tahunProduksi);
    }

    // Method klakson
    public void klakson() {
        System.out.println("Tin tin!");
    }

    // Method untuk menghitung umur kendaraan
    public int hitungUmur() {
        int tahunSekarang = LocalDate.now().getYear();
        return tahunSekarang - tahunProduksi;
    }

    // Getter dan Setter
    public String getNomorRangka() {
        return nomorRangka;
    }

    public void setNomorRangka(String nomorRangka) {
        this.nomorRangka = nomorRangka;
    }
}
