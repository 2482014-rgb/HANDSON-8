public class MethodOverridingPractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Method Overriding
         */

        // ===== BASIC METHOD OVERRIDING =====
        System.out.println("=== BASIC METHOD OVERRIDING ===");

        // Latihan 1
        Mahasiswa m1 = new Mahasiswa("2024001", "Budi", "Informatika", 3.75);
        System.out.println(m1);

        // Latihan 2
        Mahasiswa m2 = new Mahasiswa("2024001", "Budi", "Informatika", 3.75);
        System.out.println("m1.equals(m2): " + m1.equals(m2));
        System.out.println("m1 == m2: " + (m1 == m2));

        // ===== OVERRIDING WITH SUPER =====
        System.out.println("\n=== OVERRIDING WITH SUPER ===");

        Dosen d1 = new Dosen("198901001", "Dr. Sarah", "Informatika", "PBO", 10);
        d1.displayInfo();

        // Latihan 4: Chain of overriding
        System.out.println();
        DosenProfessor dp1 = new DosenProfessor("197711002", "Prof. Andika", "Informatika",
                "AI dan ML", 20, "Profesor", 50);
        dp1.displayInfo();

        // ===== COVARIANT RETURN TYPES =====
        System.out.println("\n=== COVARIANT RETURN TYPES ===");
        Dosen dClone = d1.clone();
        System.out.println("Clone berhasil dengan type yang lebih spesifik");
        System.out.println("original != clone : " + (d1 != dClone));
        System.out.println("original.equals(clone): " + d1.equals(dClone));

        // ===== OVERRIDING RULES =====
        System.out.println("\n=== OVERRIDING RULES ===");
        d1.methodProtected(); // Widening access: from protected → public

        d1.calculateSalary(); // Final method (tidak bisa dioverride)
    }
}
