public class BasicInheritancePractice {
    public static void main(String[] args) {
        System.out.println("=== INHERITANCE DASAR ===");

        // Latihan 1
        Mobil mobil = new Mobil("Toyota", "Hitam", 2022, 4, "Bensin");
        mobil.displayInfo();
        mobil.nyalakanAC();

        System.out.println();

        // Latihan 2
        Motor motor = new Motor("Honda", "Merah", 2023, "Sport");
        motor.displayInfo();
        motor.klakson();
        motor.lakukanWheely();

        System.out.println("\n=== PENGGUNAAN SUPER ===");

        // Latihan 3
        Truk truk = new Truk("Mitsubishi", "Putih", 2021, 5.0, 6);
        truk.displayInfo();

        // Latihan 4
        truk.klakson();

        System.out.println("\n=== MULTILEVEL INHERITANCE ===");

        // Latihan 5
        MobilSport mobilSport = new MobilSport("Ferrari", "Merah", 2024, 2, "Bensin", true, 320);
        mobilSport.displayInfo();
        mobilSport.aktifkanTurbo();

        System.out.println("\n=== TESTING INHERITANCE ===");

        // Latihan 6
        System.out.println("mobilSport instanceof MobilSport: " + (mobilSport instanceof MobilSport));
        System.out.println("mobilSport instanceof Mobil: " + (mobilSport instanceof Mobil));
        System.out.println("mobilSport instanceof Kendaraan: " + (mobilSport instanceof Kendaraan));
        System.out.println("mobilSport instanceof Object: " + (mobilSport instanceof Object));

        System.out.println("\n=== AKSES PROPERTY ===");

        // Latihan 7
        System.out.println("Protected property (merk): " + mobilSport.merk);
        System.out.println("Private property via getter (nomorRangka): " + mobilSport.getNomorRangka());
    }
}
