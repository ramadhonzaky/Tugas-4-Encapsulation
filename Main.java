package tugas4;

public class Main {
    public static void main(String[] args) {
        
        Persegi persegi = new Persegi();
        persegi.setSisi(5);
        System.out.println("=== PERSEGI ===");
        System.out.println("Sisi     : " + persegi.getSisi());
        System.out.println("Luas     : " + persegi.luas());
        System.out.println("Keliling : " + persegi.keliling());
        System.out.println();

        PersegiPanjang pp = new PersegiPanjang();
        pp.setPanjang(8);
        pp.setLebar(4);
        System.out.println("=== PERSEGI PANJANG ===");
        System.out.println("Panjang  : " + pp.getPanjang());
        System.out.println("Lebar    : " + pp.getLebar());
        System.out.println("Luas     : " + pp.luas());
        System.out.println("Keliling : " + pp.keliling());
        System.out.println();

        Lingkaran lingkaran = new Lingkaran();
        lingkaran.setJariJari(7);
        System.out.println("=== LINGKARAN ===");
        System.out.println("Jari-jari: " + lingkaran.getJariJari());
        System.out.printf("Luas     : %.2f\n", lingkaran.luas());
        System.out.printf("Keliling : %.2f\n", lingkaran.keliling());
        System.out.println();

        Segitiga segitiga = new Segitiga();
        segitiga.setAlas(6);
        segitiga.setTinggi(4);
        segitiga.setSisiA(6);
        segitiga.setSisiB(5);
        segitiga.setSisiC(5);
        System.out.println("=== SEGITIGA ===");
        System.out.println("Alas     : " + segitiga.getAlas());
        System.out.println("Tinggi   : " + segitiga.getTinggi());
        System.out.println("Luas     : " + segitiga.luas());
        System.out.println("Keliling : " + segitiga.keliling());
    }
}
