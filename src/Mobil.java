public class Mobil extends Kendaraan {
    // Properties tambahan
    private int jumlahPintu;
    private String jenisBahanBakar;

    // Constructor
    public Mobil(String merk, String warna, int tahunProduksi, int jumlahPintu, String jenisBahanBakar) {
        super(merk, warna, tahunProduksi);
        this.jumlahPintu = jumlahPintu;
        this.jenisBahanBakar = jenisBahanBakar;
        System.out.println("Constructor Mobil dipanggil");
    }

    // Override method displayInfo
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Jumlah Pintu: " + jumlahPintu);
        System.out.println("Bahan Bakar: " + jenisBahanBakar);
    }

    // Method tambahan khusus Mobil
    public void nyalakanAC() {
        System.out.println("AC menyala");
    }

    // Getter
    public int getJumlahPintu() {
        return jumlahPintu;
    }
}
