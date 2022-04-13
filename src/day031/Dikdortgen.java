package day031;

public class Dikdortgen {

    private int uzunKenar;
    private int kisaKenar;

    public Dikdortgen(int uzunKenar, int kisaKenar) {
        this.uzunKenar = uzunKenar;
        this.kisaKenar = kisaKenar;
    }

    public Dikdortgen() {
    }

    public int getUzunKenar() {
        return uzunKenar;
    }
    public void setUzunKenar(int uzunKenar) {
        this.uzunKenar = uzunKenar;
    }

    public int getKisaKenar() {
        return kisaKenar;
    }
    public void setKisaKenar(int kisaKenar) {
        this.kisaKenar = kisaKenar;
    }


    public int hesaplaAlan(){
        return uzunKenar*kisaKenar;
    }
    public int hesaplaCevre(){
        return 2*(uzunKenar+kisaKenar);
    }
}
