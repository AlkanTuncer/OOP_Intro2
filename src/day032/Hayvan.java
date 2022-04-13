package day032;

public class Hayvan {

    private int yas;
    private double agirlik;
    private String tur;


    public Hayvan(int yas, double agirlik, String tur) {
        this(tur);          // Aşağıda this.tur=tur; constructor'ını oluşturdugumuz için kod tekrarı olmaması için 'this()' ile buraya çağırdık.
        this.yas = yas;
        this.agirlik = agirlik;
        System.out.println("Üçlü constructor ile nesne oluşturuldu.");
    }

    public Hayvan() {
        System.out.println("Hayvan nesnesi oluşturuldu.");
    }

    public Hayvan(String tur) {
        this.tur = tur;
        System.out.println("Tek parametreli constructor ile nesne oluşturuldu.");
    }

    public int getYas() {
        return yas;
    }
    public void setYas(int yas) {
        this.yas = yas;
    }

    public double getAgirlik() {
        return agirlik;
    }
    public void setAgirlik(double agirlik) {
        this.agirlik = agirlik;
    }

    public String getTur() {
        return tur;
    }
    public void setTur(String tur) {
        this.tur = tur;
    }
}
