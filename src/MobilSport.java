public class MobilSport extends Mobil {
    // Properties tambahan
    private boolean turbo;
    private int kecepatanMaksimal;

    // Constructor
    public MobilSport(String merk, String warna, int tahunProduksi,
                      int jumlahPintu, String jenisBahanBakar,
                      boolean turbo, int kecepatanMaksimal) {
        super(merk, warna, tahunProduksi, jumlahPintu, jenisBahanBakar);
        this.turbo = turbo;
        this.kecepatanMaksimal = kecepatanMaksimal;
        System.out.println("Constructor MobilSport dipanggil");
    }

    // Override method
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Turbo: " + (turbo ? "Ya" : "Tidak"));
        System.out.println("Kecepatan Maksimal: " + kecepatanMaksimal + " km/jam");
    }

    // Method khusus MobilSport
    public void aktifkanTurbo() {
        System.out.println("TURBO DIAKTIFKAN! " + merk + " melaju dengan kecepatan maksimal!");
    }
}
