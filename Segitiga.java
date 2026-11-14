package tugas4;

public class Segitiga extends BangunDatar {
    
    private double alas;
    private double tinggi;
    
    private double sisiA;
    private double sisiB;
    private double sisiC;

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public double getAlas() {
        return alas;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setSisiA(double sisiA) {
        this.sisiA = sisiA;
    }

    public double getSisiA() {
        return sisiA;
    }

    public void setSisiB(double sisiB) {
        this.sisiB = sisiB;
    }

    public double getSisiB() {
        return sisiB;
    }

    public void setSisiC(double sisiC) {
        this.sisiC = sisiC;
    }

    public double getSisiC() {
        return sisiC;
    }

    @Override
    public double luas() {
        return 0.5 * alas * tinggi;
    }

    @Override
    public double keliling() {
        return sisiA + sisiB + sisiC;
    }
}
