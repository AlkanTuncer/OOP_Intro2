package day032_1304;

public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;                    // BURDAKİ KODLARIN AYNISINI AŞAĞIDA YAZMIŞ OLUYORUZ. BUNU İSTEMİYORUZ!
        this.y = y;
    }

    // public Point() {  --> p3 nesnesi değerlerini burdan aldı. AMA OOP'DE BUNDAN KACINILIR. KOD TEKRARI OLMUŞTUR BURDA.
    //    this.x=-1;
    //    this.y=-1;
    // }

    public Point(){             // Bu gösterim ile KOD TEKRARIndan kaçınıldı.
        this(-1,-1);      // this keyword ile yukardaki constructor metotunu(parametreli olanı) cağırdık. Bu metot ismi kullanılmadan cagırıldı 'this' sayesinde!!
    }                           // Bir constructor içerisinden başka constructor cagırılıcaksa komut ilk satıra yazılır!!!

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }

}
