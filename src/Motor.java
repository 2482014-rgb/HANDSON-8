public class Motor extends Kendaraan {
    // Properties tambahan
    private String jenisMotor; // "sport", "matic", "bebek"
    private boolean hadRemCakram;

    // Constructor
    public Motor(String merk, String warna, int tahunProduksi, String jenisMotor) {
        super(merk, warna, tahunProduksi);
        this.jenisMotor = jenisMotor;
        this.hadRemCakram = true;
        System.out.println("Constructor Motor dipanggil");
    }

    // Override method
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Jenis Motor: " + jenisMotor);
    }

    @Override
    public void klakson() {
        System.out.println("Tiiin tiiin! (suara motor)");
    }

    // Method khusus Motor
    public void lakukanWheely() {
        System.out.println(merk + " melakukan wheelie!");
    }
}
