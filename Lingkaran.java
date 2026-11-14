package tugas4;

public class Lingkaran extends BangunDatar {
    
    private double jariJari;

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    public double getJariJari() {
        return jariJari;
    }

    @Override
    public double luas() {
        return Math.PI * jariJari * jariJari;
    }

    @Override
    public double keliling() {
        return 2 * Math.PI * jariJari;
    }
}
