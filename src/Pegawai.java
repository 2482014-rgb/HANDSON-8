public class Pegawai {
    // Properties
    protected String nip;
    protected String nama;
    protected String jurusan;

    // Constructor
    public Pegawai(String nip, String nama, String jurusan) {
        System.out.println("Pegawai constructor called");
        this.nip = nip;
        this.nama = nama;
        this.jurusan = jurusan;
    }

    // Method untuk di-override
    public void displayInfo() {
        System.out.println("=== Info Pegawai ===");
        System.out.println("NIP: " + nip);
        System.out.println("Nama: " + nama);
        System.out.println("Jurusan: " + jurusan);
    }

    // Method clone dengan return type Pegawai
    public Pegawai clone() {
        return new Pegawai(this.nip, this.nama, this.jurusan);
    }

    // Protected method untuk ditest widening
    protected void methodProtected() {
        System.out.println("Protected method in Pegawai");
    }

    // Final method - tidak bisa di-override
    public final void calculateSalary() {
        System.out.println("Menghitung gaji pegawai...");
    }

    @Override
    public String toString() {
        return "Pegawai{" +
                "nip='" + nip + '\'' +
                ", nama='" + nama + '\'' +
                ", jurusan='" + jurusan + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Pegawai)) return false;
        Pegawai other = (Pegawai) obj;
        return this.nip != null && this.nip.equals(other.nip);
    }

    @Override
    public int hashCode() {
        return nip != null ? nip.hashCode() : 0;
    }
}

