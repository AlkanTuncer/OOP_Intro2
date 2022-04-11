package day030;

public class Personel {

    private String adi;
    private String soyadi;
    private int yasi;
    private double maasi;

    // PERSONELİN ÖZELLİKLERİ
    public void setAdi(String adi){
        this.adi=adi; //this --> keywordu nesne create edildiği zaman oluşan nesneyi temsil eder. 'p1 nesnesini temsil eder.'(MainApp kısmında olusturdugumuz nesne.)
    }                                           // this --> 2 variable çakışdığı zaman this kullanılır.
    public String getAdi() {
        return this.adi;
    }

    public void setSoyadi(String soyadi){           // Hafızada kaydetmek için 'set' kullanıyoruz. Void'dir geriye bişe döndürmez.
        this.soyadi=soyadi;
    }
    public String getSoyadi(){                      // Hafızadan çağırmak için 'get' kullanıyoruz. Return kullanıyoruz geriye tanımladığımız değeri döndürücek.
        return this.soyadi;
    }

    public void setYasi(int yasi){
        this.yasi=yasi;
    }
    public int getYasi(){
        return yasi;
    }

    public void setMaasi(double maasi){
        this.maasi=maasi;
    }
    public double getMaasi(){
        return maasi;
    }

    // PERSONELİ ÇALIŞTIRALIM
    public void calis(){
        System.out.println(this.adi+" "+this.soyadi+" isimli personel çalışıyor.");
    }

    public void evrakImzala(){
        System.out.println("Personel evrak imzalıyor.");
    }

    public void bilgileriGoster(){
        System.out.println();
        System.out.println("Personelin Adı-Soyadı : "+this.getAdi()+" "+this.getSoyadi());
        System.out.println("Personelin Yaşı : "+this.getYasi());
        System.out.println("Personelin Maaşı : "+this.getMaasi());
    }

}
